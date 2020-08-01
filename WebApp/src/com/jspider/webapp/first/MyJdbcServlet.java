package com.jspider.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class MyJdbcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		
		Connection CON = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			String dburl = "jdbc:mysql://localhost:3306/jspider?user=root&password=root";
			CON = DriverManager.getConnection(dburl);

			String query = " select * from studentinfo ";
			stmt = CON.createStatement();

			rs = stmt.executeQuery(query);
			
			String htmlres = " <html> "
					+ " <head> "
					+ " <title> "
					+ " MyJdbcServlet "
					+ " </title> "
					+ " </head> "
					+ " <body> "
					+ " <table> "
					+ " <tr> "
					+ " <th> "+"regno"+ "</th>"
					+ " <th> "+"firstname"+ "</th>"
					+ " <th> "+"middlename"+ "</th>"
					+ " <th> "+"lastname"+ "</th>"
					+ "</tr>";
			
			
			while (rs.next()) {
				int regNum = rs.getInt("regno");
				String fName = rs.getString("firstname");
				String mName = rs.getString("middlename");
				String lName = rs.getString("lastname");
				
				htmlres = htmlres+"<tr>"
						+ " <td> "+regNum+ "</td>"
						+ " <td> "+fName+ "</td>"
						+ " <td> "+mName+ "</td>"
						+ " <td> "+lName+ "</td>"
						+ "</tr>";
			}
			htmlres = htmlres + "</table>"
					+ "</body>"
					+ "</html>";
			
			out.println(htmlres);

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (CON != null) {
					CON.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
