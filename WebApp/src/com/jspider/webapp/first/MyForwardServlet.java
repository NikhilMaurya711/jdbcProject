package com.jspider.webapp.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String url = "request"; //Dynamic webresource//do post
		String url1= "CurrentDate.html";//Static WebResource
		
		String url2= "https://www.google.com";//external web resources

		RequestDispatcher dispatcher = req.getRequestDispatcher(url1);
		dispatcher.forward(req,resp);
	}
}
