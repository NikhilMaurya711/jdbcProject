package com.classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JdbcStudent {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt1=null;
				
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			
			String dburl = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			
			String query1 = " insert into Student "
					+ " values(?,?,?,?,?) ";
			
						
			pstmt1 = con.prepareStatement(query1);
			
			
			pstmt1.setInt(1, Integer.parseInt(args[0]));
			pstmt1.setString(2, args[1]);
			pstmt1.setInt(3, Integer.parseInt(args[2]));
			pstmt1.setInt(4, Integer.parseInt(args[3]));
			pstmt1.setInt(5, Integer.parseInt(args[4]));
			
			
			
			int i1=pstmt1.executeUpdate();
			
			
			if(i1!=0){
				System.out.println("Student details are filled sucessfully");
			}else
			{
				System.out.println("Student details are not filled ");
			}
				
			
							
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
				try {
					if(con!=null)
						con.close();
					
					if(pstmt1!=null)
						pstmt1.close();
					
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
		}
}


}
