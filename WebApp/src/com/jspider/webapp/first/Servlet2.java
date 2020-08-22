package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		Object obj = null;
		HttpSession session = req.getSession();
		
		obj = session.getAttribute("ClassA");
		ClassA refA = (ClassA) obj;
		
		PrintWriter out = resp.getWriter();

		if (obj != null) {
			out.println("Name : " + refA.name);
			out.println("value : " + refA.value);

		} else {
			out.println("Inavlid request");

		}
		
		/*====context=====
		Object obj = null;
		ServletContext context = req.getServletContext();
		obj =context.getAttribute("ClassA");

		ClassA refA = (ClassA) obj;

		PrintWriter out = resp.getWriter();

		if (obj != null) {
			out.println("Name : " + refA.name);
			out.println("value : " + refA.value);

		} else {
			out.println("Inavlid request");

		}
		/*===req attribute
		 * Object obj = null; obj = req.getAttribute("ClassA");
		 * 
		 * ClassA refA = (ClassA) obj;
		 * 
		 * PrintWriter out = resp.getWriter();
		 * 
		 * if (obj != null) { out.println("Name : " + refA.name); out.println("value : "
		 * + refA.value);
		 * 
		 * } else { out.println("Inavlid request");
		 * 
		 * }
		 * 
		 */

	}
}