package com.info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbcdynamic {

	public static void main(String[] args) {

		 try {
			Driver dref = new Driver();
			DriverManager.registerDriver(dref);
			String dburl ="jdbc:mysql://localhost:3306/java?user=root&password=root" ; 
			
			Connection con=DriverManager.getConnection(dburl);
			/*
			String query = " select * from info "
					+ " where id = ? ";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]) );
			
			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
			}
			*/
			System.out.println("=========================");
			
			String query1 = " insert into info "
					+ " values(?,?) " ;

			PreparedStatement pstmt1 = con.prepareStatement(query1);
			pstmt1.setInt(1,Integer.parseInt(args[0]) );
			pstmt1.setString(2,args[1]);
		
			int rs1 = pstmt1.executeUpdate();
			
			
			
		} catch (SQLException e) {


			e.printStackTrace();
		}
	}

}
