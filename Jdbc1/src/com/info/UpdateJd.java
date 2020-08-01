package com.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class UpdateJd {


	public static void main(String[] args) {
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			String dburl ="jdbc:mysql://localhost:3306/java?user=root&password=root" ; 
			
			Connection con=DriverManager.getConnection(dburl);
			
			
			String query1 = " update info "
					+ " set name = ? "
					+ " where id = ? " ;

			PreparedStatement pstmt1 = con.prepareStatement(query1);
			pstmt1.setString(1,args[0]);
			pstmt1.setInt(2,Integer.parseInt(args[1]) );
			
		
			int rs1 = pstmt1.executeUpdate();
			
			if(rs1!=0){
				System.out.println("Successuly updated");
			}
		
			else
			System.out.println("=not successful====");
			
			
		} catch (SQLException e) {


			e.printStackTrace();
		}

	}

}
