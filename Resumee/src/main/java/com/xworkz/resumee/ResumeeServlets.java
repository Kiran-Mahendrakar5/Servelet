package com.xworkz.resumee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class ResumeeServlets extends HttpServlet {

	public ResumeeServlets() {
		System.out.println("its defoult ResumeeServlets");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("this is do get method");

		String username = req.getParameter("Firstname");
		String username1 = req.getParameter("lastname");
		String email = req.getParameter("email");
		String qualification = req.getParameter("qualification");
		String linkedIn = req.getParameter("linkedIn");
		String githublink = req.getParameter("githublink");
		String skills = req.getParameter("skills");
		String areaOfInterest = req.getParameter("areaOfInterest");
		String courseName = req.getParameter("courseName");
		String projectName = req.getParameter("projectName");
		String jobRole = req.getParameter("jobRole");

		System.out.println(username + username1 + email + qualification + linkedIn + githublink + skills
				+ areaOfInterest + courseName + projectName + jobRole);

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>WELCOME</h1>");
		writer.println(username + username1 + email + qualification + linkedIn + githublink + skills + areaOfInterest
				+ courseName + projectName + jobRole);

	}

}
