package com.xworkz.amazon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/amazon",initParams = {@WebInitParam (name = "user" ,value = "kiran"),@WebInitParam(name="pass" ,value = "123456")})
public class AmazonRunner extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String passward = req.getParameter("passward");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String corname = getInitParameter("user");
		String corpass = getInitParameter("pass");
		printWriter.println(name);
		printWriter.println(passward);

		if (name != null && passward != null) {

			if (name.equals("kiran") && passward.equals("123456")) {
				System.out.println("credential is correct ");

				req.getRequestDispatcher("/Welcome.jsp").forward(req, resp);

			} else {
				req.getRequestDispatcher("/LogIn.jsp").include(req, resp);

				resp.getWriter().println("Name or Password is not maching");
			}

		} else {
			req.getRequestDispatcher("/LogIn.jsp").include(req, resp);

			resp.getWriter().println("Name or Password is cannot be empty");
		}

	}

}
