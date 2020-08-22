package com.jspiders.studentapp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class ConnnectionProvider {
	
	public static Connection giveConnection() {
		Connection CON = null;
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String dburl = "jdbd:mysql://localhost:3306/studentapp?user=root&password=root";
			CON = DriverManager.getConnection(dburl);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return CON;
	}

}
