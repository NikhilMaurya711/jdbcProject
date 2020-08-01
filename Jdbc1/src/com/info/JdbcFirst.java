package com.info;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


import com.mysql.jdbc.Driver;

public class JdbcFirst {

	public static void main(String[] args) {
		
		try {
			Driver dref =  new Driver();
			DriverManager.registerDriver(dref);
			
			String dburl= "jdbc:mysql://localhost:3306/java?user=root&password=root";
			
			Connection con = DriverManager.getConnection(dburl);
			
			String query = " insert into info "
					+ " values(403,'Programming') " ;
					
			String query2 = " select * from info " ;
			
			Statement stmt =con.createStatement(); 
			Statement stmt2 =con.createStatement();
			int rs = stmt.executeUpdate(query);
			ResultSet rs2=stmt2.executeQuery(query2);
			
			while(rs2.next())
			{
				System.out.println(rs2.getInt("id"));
				System.out.println(rs2.getString("name"));
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
