package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Xyz  extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Date date = new Date();
		PrintWriter out = resp.getWriter();
		
		resp.setHeader("Refresh","1");
		out.println("current Date and response: " + date);
		
	}
}
