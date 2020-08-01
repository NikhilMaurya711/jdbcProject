package com.nik.jdbc.first;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) {

		File F=new File("F:\\skillrary_nik\\J2EE\\doc/MyProp.properties");
		
		boolean bool;
		try {
			bool = F.createNewFile();
			System.out.println(bool);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		 * File f2=new File(path);
		System.out.println(f2.exists());
		try {
			boolean b1=f2.createNewFile();
			System.out.println(b1);
		} catch (IOException e) {
			System.out.println("Error occered");
			e.printStackTrace();
		}
		System.out.println(f2.exists());
		
		FileReader fr=null;
		
		try {
			fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//C:\Users\NIkhil>F:\skillrary_nik\J2EE\doc\MyProp.properties
		*/
	}

}
