package com.xworkz.istore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send", initParams = { @WebInitParam(name = "user", value = "Kiran"),
		@WebInitParam(name = "passward", value = "123456") })

public class IstoreRunner extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("username");
		String passward = req.getParameter("passward");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String correname = getInitParameter("user");
		String correpass = getInitParameter("passward");
		printWriter.println(name);
		printWriter.println(passward);

		if (!name.isEmpty() && !passward.isEmpty()) {
			System.out.println("credentials is correct");
			if (name.equals(correname) && passward.equals(correpass)) {
				req.getRequestDispatcher("/Welcome.jsp").forward(req, resp);

			} else {
				printWriter.println("credentials is wrong! TRY AGAIN.....................");
				req.getRequestDispatcher("/LogIn.jsp").include(req, resp);
			}
		}

	}

}
