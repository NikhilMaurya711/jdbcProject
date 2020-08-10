package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieClass extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Cookie ck=new Cookie("MyNme", "Nik");
		Cookie ck2=new Cookie("MyLocation","Mumbai");
		ck2.setMaxAge(7*24*60*60);
		
		resp.addCookie(ck);
		resp.addCookie(ck2);
		
		PrintWriter out = resp.getWriter();
		out.println("Cookie created: ");
	}
}
