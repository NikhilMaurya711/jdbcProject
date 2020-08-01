package com.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DeleteDynamicJDBC {

	public static void main(String[] args) {
		try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			String dburl ="jdbc:mysql://localhost:3306/java?user=root&password=root" ; 
			
			Connection con=DriverManager.getConnection(dburl);
			
			
			String query1 = " delete from info "
					+ " where id = ? " ;

			PreparedStatement pstmt1 = con.prepareStatement(query1);
			pstmt1.setInt(1,Integer.parseInt(args[0]) );
			pstmt1.setString(2,args[1]);
		
			int rs1 = pstmt1.executeUpdate();
			
			if(rs1!=0){
				System.out.println("Successuly deleted");
			}
		
			else
			System.out.println("=not successful====");
			
			
		} catch (SQLException e) {


			e.printStackTrace();
		}

	}

}
