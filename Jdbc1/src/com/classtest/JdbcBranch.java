package com.classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JdbcBranch {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt2=null;
		
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			
			String dburl = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			
			
			String query2 = " insert into branch "
					+ " values(?,?) ";
			
			
			
			pstmt2 = con.prepareStatement(query2);
		
			
			pstmt2.setInt(1, Integer.parseInt(args[0]));
			pstmt2.setString(2, args[1]);
			
			int i2=pstmt2.executeUpdate();
		
			
			if(i2!=0){
				System.out.println("Branch details are filled sucessfully");
			}else
			{
				System.out.println("Branch details are not filled ");
			}
			
			
							
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
			try {
				if(con!=null)
					con.close();
				
				if(pstmt2!=null)
					pstmt2.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
	}
}
}
