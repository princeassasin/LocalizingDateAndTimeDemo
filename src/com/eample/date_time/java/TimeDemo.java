package com.eample.date_time.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter choice of Country to display Time:");
		int choice = sc.nextInt();
		sc.close();
		if (choice==1){
			System.out.println("Chinies");
		DateFormat df =	DateFormat.getTimeInstance(DateFormat.LONG, new Locale("zh","CN"));
		String time = df.format(new Date());
		System.out.println(time);
		}
		else if (choice==2){
			System.out.println("Australia");
			DateFormat df =	DateFormat.getTimeInstance(DateFormat.LONG, new Locale("au","AU"));
			String time = df.format(new Date());
			System.out.println(time);
		}
		else if (choice==3){
			System.out.println("German");
			DateFormat df =	DateFormat.getTimeInstance(DateFormat.LONG, new Locale("de","DE"));
			String time = df.format(new Date());
			System.out.println(time);
		}
		else if (choice==4){
			System.out.println("England");
			DateFormat df =	DateFormat.getTimeInstance(DateFormat.LONG, new Locale("en","EN"));
			String time = df.format(new Date());
			System.out.println(time);
		}
		else{
			System.out.println("Enter corret choice!!");
		}
		
	}

}
