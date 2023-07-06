package com.xworkz.happyy;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")


public class HappyyServlets extends HttpServlet{
	
	public HappyyServlets() {
		System.out.println("defoult constructor of HappyyServlets");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("this is do get method");
	}

}
