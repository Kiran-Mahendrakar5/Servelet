package com.xworkz.election;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;

@WebServlet(urlPatterns = "/send")
//, initParams = { @WebInitParam(name = "names", value = "Kiran"),
//		@WebInitParam(name = "phnum", value = "97388311322"), @WebInitParam(name = "ages", value = "21"),
//		@WebInitParam(name = "adress", value = "hosadurge"), @WebInitParam(name = "pin", value = "577527"), })

public class ElectionServlet extends HttpServlet {

	private ElectionService service = new ElectionServiceImpl();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber"); 
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String pincode = request.getParameter("pincode");
		
		response.setContentType("text/html");
		PrintWriter print = response.getWriter();

//		String correname = getInitParameter("names");
//		String corrphonenu = getInitParameter("phnum");
//		String correage = getInitParameter("ages");
//		String correaddr = getInitParameter("adress");
//		String correpin = getInitParameter("pin");
		print.println(name);
		print.println(phoneNumber);
		print.println(age);
		print.println(address);
		print.println(pincode);
		

		ElectionDto dto = new ElectionDto(5, name, phoneNumber, age, address, pincode);//dto set
		

		boolean status = service.save(dto);

		if (!name.isEmpty()&&!phoneNumber.isEmpty()&&!age.isEmpty()&&!address.isEmpty()&&!pincode.isEmpty()) {
			System.out.println("credentials is validated correctly");
//			if (name.equals(correname)&&(phoneNumber.equals(corrphonenu))&&(age.equals(correage))&&(address.equals(correaddr))&&(pincode.equals(correpin)));
			request.getRequestDispatcher("/Read.jsp").forward(request, response);
		} else {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("PLEASE ENTER YOUR DATA....................");
			request.getRequestDispatcher("/ElectionForm.jsp").include(request, response);
		}

	}

}
