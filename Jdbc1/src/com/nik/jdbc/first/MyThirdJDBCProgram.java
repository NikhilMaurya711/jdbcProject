package com.nik.jdbc.first;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;





public class MyThirdJDBCProgram {

	public static void main(String[] args) throws IOException {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		File file = new File("F:\\skillrary_nik\\J2EE\\doc/MyProp.properties");
		FileReader reader = new FileReader(file);
		Properties prop = new Properties();
		prop.load(reader);
		
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);
			
			String dburl=prop.getProperty("dburl");
			con=DriverManager.getConnection(dburl, prop);
			
			String query= " delete from studentinfo "
					+ " where regno = ? ";
					
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			
			int res = pstmt.executeUpdate();

			if(res != 0){
				System.out.println("Student record deleted");
			}else if(res == 0){
				System.out.println("Student record not present");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			try{
				if(con!=null)
					con.close();
				if(pstmt!=null)
					pstmt.close();
				
			}catch(SQLException e2){
				e2.printStackTrace();
			}
		}
		
		
	}

}
