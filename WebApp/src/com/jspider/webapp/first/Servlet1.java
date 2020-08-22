package com.jspider.webapp.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		ClassA refA = new ClassA("jspider", 100);
		
		HttpSession session = req.getSession();
		
		session.setAttribute("ClassA", refA);
			
		String url = "servlet2";
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
		/*====context=====
		ClassA refA = new ClassA("jspider", 100);
		
		ServletContext context = req.getServletContext();
		
		context.setAttribute("ClassA", refA);
		
		String url = "servlet2";
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
		
		/*===req attribute
		ClassA refA = new ClassA("jspider", 100);
		req.setAttribute("ClassA", refA);
		String url = "servlet2";
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
		
		*/
	}
}


