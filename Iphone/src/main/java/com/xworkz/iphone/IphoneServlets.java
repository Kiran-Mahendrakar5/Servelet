package com.xworkz.iphone;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")
public class IphoneServlets extends HttpServlet {
	
	public IphoneServlets() {
		System.out.println("defoult constructor of IphoneServlets");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("this is do get method");
	}

}



