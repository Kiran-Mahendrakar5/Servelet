package com.xworkz.market;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/send")
public class MarketServlets extends HttpServlet {
	
	public MarketServlets() {
		System.out.println("defoult constructor of MarketServlets");
		
	}
	
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("this is do get method");
	}

}
