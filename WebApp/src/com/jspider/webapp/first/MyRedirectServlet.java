package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyRedirectServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String url = "request"; //Dynamic webresource
		String url1= "CurrentDate.html";//Static WebResource
		
		String url2= "https://www.google.com";//external web resources
		resp.sendRedirect(url2);
	}
}
