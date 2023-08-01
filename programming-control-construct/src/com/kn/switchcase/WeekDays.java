package com.kn.switchcase;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		weekdays(n);
		sc.close();
		
	}
	public static String weekdays(int n) {
		switch(n) {
		case 1:
			System.out.println("Monday"); 
			break;
		case 2:
			System.out.println( "Tue"); 
			break;
		case 3:
			System.out.println("wen");  
			break;
		case 4:
			System.out.println("Thr");  
			break;
		case 5:
			System.out.println("fri");  
			break;
		case 6:
			System.out.println("sat");  
			break;
		case 7:
			System.out.println("sun"); 
			break;
			default:
				System.out.println("Invalid i/p");
		}
  return "The End";
		}
	
}
