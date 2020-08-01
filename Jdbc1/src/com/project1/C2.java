package com.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVWriter;

public class C2 {

	public static void main(String[] args) {
		CSVWriter writer;
		Scanner sc;
		try {
			sc = new Scanner(
					new File("C:\\Users\\NIkhil\\workspace\\File handling\\sample folder\\sample2/cm29JAN2020bhav.csv"));
			sc.useDelimiter(","); // sets the delimiter pattern
		
				//System.out.print(sc.next()); // find and returns the next complete token from this scanner
				try {
					writer = new CSVWriter(new FileWriter(args[0]+"output7.csv"));
					 //Writing data to a csv file
					int i=0;
					while (sc.hasNext()) // returns a boolean value
					{
						if(sc.next() != null) {
							String line2[] = {"1", "Krishna", "2548", "2012-01-01", "IT"};
							   
						      //Writing data to the csv file
						      writer.writeNext(line2);
						    
						      //Flushing data from writer to file
						      
						      System.out.println("Data entered");	
						}
				      
				    
					}
					  
				      writer.flush();
				      sc.close(); // closes the scanner
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     
			
				
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			//CSVWriter writer = new CSVWriter(new FileWriter("D:\\Desktop\\iconnect/output.csv"));
		    FileWriter writer = new FileWriter("D:\\Desktop\\iconnect/output.csv", true);
		    for (int i=0; i<data.size(); i++) {
		        writer.append(String.valueOf(data.get(i)));
		        writer.append(",");
		        writer.append("\n");
		    }
		    writer.flush();
		    writer.close();
		} catch (Exception e) {} 

	}

}
