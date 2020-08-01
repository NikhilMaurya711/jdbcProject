package com.nik.jdbc.first;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyFolder {

	public static void main(String[] args) {
		String path="F:\\skillrary_nik\\J2EE\\doc\samfolder";
		File f2=new File(path);
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());
	}

}
