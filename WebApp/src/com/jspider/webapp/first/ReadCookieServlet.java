package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Cookie[] ck= req.getCookies();
			
		PrintWriter out = resp.getWriter();
		out.println("Total number of Cookies: "+ck.length);
		for(Cookie c: ck) {
			out.println("name : "+c.getName());
			out.println("name : "+c.getValue());
		}
		resp.setHeader("Refresh","1");
	}
}
