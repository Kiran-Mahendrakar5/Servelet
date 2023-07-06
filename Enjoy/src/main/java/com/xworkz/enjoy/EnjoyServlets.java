package com.xworkz.enjoy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class EnjoyServlets extends HttpServlet {

	public EnjoyServlets() {
		System.out.println("defoult constructor of EnjoyServlets");

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("this is do get method");

		String username = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println(username + email);

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>GO BACK</h1>");
		writer.println(username + email);
	}

}
