package com.classtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcRetriveTest {


	public static void main(String[] args) {
		
			try {
				Driver dref = new Driver();
				DriverManager.registerDriver(dref);
				
				String dburl = "jdbc:mysql://localhost:3306/jdbc?user=root&password=root";
				Connection con=DriverManager.getConnection(dburl);
							
				String query4 = " select * from Student ,Branch ,address "
						+ " where Student.brancch_id=Branch.brancch_id and student.pincode=address.pincode " ;
						
						
				Statement stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery(query4);
				
				while(rs.next()){
					System.out.println("Student id ="+rs.getInt("s_id"));
					System.out.println("Student name ="+rs.getString("s_name"));
					System.out.println("Student age ="+rs.getInt("s_age"));
					System.out.println("Branch id ="+rs.getInt("brancch_id"));
					System.out.println("Pincode ="+rs.getInt("pincode"));
					System.out.println("Branch name ="+rs.getString("branch_name"));
					System.out.println("Pincode ="+rs.getInt("brancch_id"));
					System.out.println("city ="+rs.getInt("pincode"));
					System.out.println("street ="+rs.getString("branch_name"));
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	}


}
