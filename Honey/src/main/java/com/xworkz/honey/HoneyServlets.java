package com.xworkz.honey;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")
public class HoneyServlets  extends HttpServlet{
	
	public HoneyServlets() {
		System.out.println("defoult constructor of HoneyServlets");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("this is do get method");
	}


}
