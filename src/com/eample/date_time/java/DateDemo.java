package com.eample.date_time.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter choice of Country");
		int choice = sc.nextInt();
		sc.close();
		if(choice == 1){
			System.out.println("Date in Chinies");
			DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("zh","CN"));
		String date = df.format(new Date());
		System.out.println(date);
		}else if(choice==2){
			System.out.println("Date in Australia");
			DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("au","AU"));
			String date1 = df1.format(new Date());
			System.out.println(date1);

		}
	   else if(choice==3){
		System.out.println("Date in German");
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("de","DE"));
		String date1 = df1.format(new Date());
		System.out.println(date1);
		
	}
	   else if(choice==4){
		   System.out.println("Date in English");
		   DateFormat df1 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","EN"));
		   String date1 = df1.format(new Date());
		   System.out.println(date1);
		   
	   }
	
		else{
			System.out.println("Enter Correct Country");
		}

	}

}
