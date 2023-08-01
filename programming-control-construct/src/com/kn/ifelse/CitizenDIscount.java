package com.kn.ifelse;

import java.util.Scanner;

public class CitizenDIscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		citizendiscount(age);
		sc.close();
	}
	public static void citizendiscount(int age) {
	if (age > 60) {
		System.out.println("Eligible for a senior citizen discount");
	} else {
		System.out.println("Not Eligible");
	}
	}
	}


