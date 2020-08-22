package com.jspiders.studentapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		

		String email = req.getParameter("Admin-Email");
		String password = req.getParameter("Admin-password");

		if (email.equals("admin@jspiders.com") && password.equals("admin8055")) {
			out.println("response is generated");

		} else {
			out.println("Sorry your email or password is incorrect");
		}
	}

}
