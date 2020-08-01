package com.jspider.webapp.first;

import java.util.Date;

public class MainClass {

	public static void display(int num,String s1)
	{
		String [] one={"","one","two","three","four","five",
				"six","seven","eight","nine","ten",
				"eleven","tweleve","thirteen","fourteen",
				"fifteen","sixteen","seventeen","eighteen",
				"nineteen"};
		
		String[] two={"","","twenty","thirty","fourty","fifty",
				"sixty","seventy","eighty","ninty"}; 
		
		if(num<20)
		{
		System.out.print(one[num]);
		}
		else
		{
		System.out.print(two[num/10]+" "+one[num%10]);
		}
		if(num>0)
		{
		System.out.print(s1);	
		}
	}
	public static void main(String [] args)
	{
		int num=123456789;
		display(num/10000000," crore ");
		display((num/100000)%100," lakh ");
		display((num/1000)%100," thousand ");
		display((num/100)%10," hundred ");
		display(num%100," ");
		
	}

}
