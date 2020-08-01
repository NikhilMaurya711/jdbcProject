package com.classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class JdbcTest {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
			try {
				Driver dref = new Driver();
				DriverManager.registerDriver(dref);
				
				String dburl = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
				con=DriverManager.getConnection(dburl);
				
				String query1 = " insert into Student "
						+ " values(?,?,?,?,?) ";
				
				String query2 = " insert into branch "
						+ " values(?,?) ";
				
				String query3 = " insert into address "
						+ " values(?,?,?) ";
				
				 pstmt1 = con.prepareStatement(query1);
				 pstmt2 = con.prepareStatement(query2);
				 pstmt3 = con.prepareStatement(query3);
				
				pstmt1.setInt(1, Integer.parseInt(args[0]));
				pstmt1.setString(2, args[1]);
				pstmt1.setInt(3, Integer.parseInt(args[2]));
				pstmt1.setInt(4, Integer.parseInt(args[3]));
				pstmt1.setInt(5, Integer.parseInt(args[4]));
				
				
				pstmt2.setInt(6, Integer.parseInt(args[5]));
				pstmt2.setString(7, args[6]);
				
				pstmt3.setInt(8, Integer.parseInt(args[7]));
				pstmt3.setString(9, args[8]);
				pstmt3.setString(10, args[9]);
				
				int i1=pstmt1.executeUpdate();
				int i2=pstmt2.executeUpdate();
				int i3=pstmt3.executeUpdate();
				
				if(i1!=0){
					System.out.println("Student details are filled sucessfully");
				}else
				{
					System.out.println("Student details are not filled ");
				}
				
				if(i2!=0){
					System.out.println("Branch details are filled sucessfully");
				}else
				{
					System.out.println("Branch details are not filled ");
				}
				
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
					
					if(pstmt1!=null)
						pstmt1.close();
					if(pstmt2!=null)
						pstmt1.close();
					if(pstmt3!=null)
						pstmt1.close();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
	}

}
