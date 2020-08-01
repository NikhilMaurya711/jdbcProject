package com.nik.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class MyFirstJdbcProgram {

	public static void main(String[] args) throws SQLException {
		
		Connection con=null ;
		//PreparedStatement pstmt =null;
		Statement stmt =null;
		ResultSet rs=null;
		
	try {
		
			Driver DriverRef= new Driver();
			DriverManager.registerDriver(DriverRef);
			String dburl="jdbc:mysql://localhost:3306/jspider?user=root&password=root";
			con = DriverManager.getConnection(dburl);
		
			System.out.println("enter:");
			String query = " select * from studentinfo ";
							
			
			
			//pstmt =con.prepareStatement(query);
			
			stmt =con.createStatement();
			//pstmt.setInt(1,Integer.parseInt(args[0]));
			
			//rs = pstmt.executeQuery();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				int regNum = rs.getInt("regno");
				String fName = rs.getString("firstname");
				String mName = rs.getString("middlename");
				String lName = rs.getString("lastname");
			}
		
			//pstmt.executeUpdate();
			//stmt.executeQuery(query);
			
			
			
		} catch (SQLException e) {
			
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
		//System.out.println("end");
		
		
		
		
	}

}
