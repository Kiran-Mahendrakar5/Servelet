package com.xworkz.myntra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send",initParams = {@WebInitParam(name = "user",value = "Kiran"),@WebInitParam(name = "passward",value = "123456")})

public class MyntraRunner extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String passward = req.getParameter("passward");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String names= getInitParameter("user");   //wedinitparamio
		String pass = getInitParameter("passward");//wedinitparam
		printWriter.println(name);//getparameterref
		printWriter.println(passward);//getparameterref
		
		if(!name.isEmpty()&&!passward.isEmpty()) {//getparameterref
			System.out.println("credentials is correct");//getparameterref
			if(name.equals(names)&&passward.equals(pass)) {
				req.getRequestDispatcher("/Welcome.jsp").forward(req, resp);
				
			}else {
				printWriter.println("credentials wrong!Please Try agin..............");
				req.getRequestDispatcher("/LogIn.jsp").include(req, resp);
			}
		}

	}

}
