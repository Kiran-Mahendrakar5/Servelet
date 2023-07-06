package com.xworkz.boringg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class BorningServlet extends HttpServlet {
	

	public BorningServlet() {
		System.out.println(" defoult constructor BorningServlet");
	}
	
	@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) {
			System.out.println("this is do get method");
		}
	
	
	
	

}
