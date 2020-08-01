package com.classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JdbcAddress {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt3 = null;
		
			try {
				Driver dref = new Driver();
				DriverManager.registerDriver(dref);
				
				String dburl = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
				con=DriverManager.getConnection(dburl);
				
				
				String query3 = " insert into address "
						+ " values(?,?,?) ";
				
				 pstmt3 = con.prepareStatement(query3);
				
			
				pstmt3.setInt(1, Integer.parseInt(args[0]));
				pstmt3.setString(2, args[1]);
				pstmt3.setString(3, args[2]);
				
				int i3=pstmt3.executeUpdate();
				
				
				if(i3!=0){
					System.out.println("Address details are filled sucessfully");
				}else
				{
					System.out.println("Address details are not filled ");
				}
				
				
								
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally{
			
				try {
					if(con!=null)
						con.close();
					
					
					if(pstmt3!=null)
						pstmt3.close();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
	}
}
