package com.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class C3 {

	public static void main(String[] args) {
				
		Connection con=null;
		Statement stmt = null;
		
		try{
		Driver driverref =new Driver();
		DriverManager.registerDriver(driverref);
		
		String dburl="jdbc:mysql://localhost:3306/mysql?user=root&password=root" ;
		con=DriverManager.getConnection(dburl);
			
		String query1 ="  ";		
		String query2 ="   ";
		String query3 =	 " create table test "
				+ " ( SYMBOL varchar(20), "
				+ "  SERIES varchar(20),  "
				+ " OPEN Double,  "
				+ "	HIGH Double , "
				+ "	LOW Double , "
				+ "	CLOSE Double , "
				+ "	LAST Double , "
				+ " PREVCLOSE Double, "
				+ "	TOTTRDQTY Double,	"
				+ " TOTTRDVAL Double, "
				+ "	TIMESTAMP Date, "
				+ "	TOTALTRADES int, "
				+ "	ISIN String ) ";	
		String query=query1+query2+query3;
		
		stmt = con.createStatement();
		int res= stmt.executeUpdate(query);
		if(res!=0)
		{
			System.out.println("Student Record inserted");
		}
		
				
		}catch(SQLException e){
			e.printStackTrace();;
		}finally {
			
		}

		
	}

}
