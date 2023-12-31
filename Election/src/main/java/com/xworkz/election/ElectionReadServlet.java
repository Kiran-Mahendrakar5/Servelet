package com.xworkz.election;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;

@WebServlet(name = "/read")
public class ElectionReadServlet extends HttpServlet {
	
	ElectionService service = new ElectionServiceImpl();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ElectionDto dto1 = new ElectionDto();
//		dto1.setName(request.getParameter("names"));
//		dto1.setPhoneNumber(request.getParameter("phnum"));
//		dto1.setAge(request.getParameter("ages"));
//		dto1.setAddress(request.getParameter("adress"));
//		dto1.setPincode(request.getParameter("pin"));
		
		

		

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		List<ElectionDto> list = service.readAll();
		writer.print("Data Read Successfully");

		for (ElectionDto dto : list) {
			
			writer.println(dto.getName());
			writer.println(dto.getPhoneNumber());
			writer.println(dto.getAge());
			writer.println(dto.getAddress());
			writer.println(dto.getPincode());
			
//			writer.println(dto);

		}

	}
}
