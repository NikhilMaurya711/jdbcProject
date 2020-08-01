package com.nik.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class StaticJdbc {

	public static void main(String[] args) {
		
		Connection con=null ;
		Statement stmt =null;
		ResultSet rs=null;
		
		try {
			
				Driver DriverRef= new Driver();
				DriverManager.registerDriver(DriverRef);
				
				String dburl="jdbc:mysql://localhost:3306/jspider?user=root&password=root";
				con = DriverManager.getConnection(dburl);

				String query = " select * from studentinfo ";
				stmt = con.createStatement();
				
				rs= stmt.executeQuery(query);
				
				while(rs.next()){
					int regNum = rs.getInt("regno");
					String fname=rs.getString("firstname");
					String mName = rs.getString("middlename");
					String lName = rs.getString("lastname");
					
					System.out.println("RegNum = "+regNum);
					System.out.println("firstname = "+fname);
					System.out.println("middlename = "+mName);
					System.out.println("lastname = "+lName);
				}
					
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

}
