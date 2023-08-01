package com.kn.ifelse;

import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		multipleoften( num);
		sc.close();
		
	}
	public static void multipleoften(int num) {
		if (num % 10==0) {
			System.out.println("A number is a multiple of 10.");
		} else {
			System.out.println("A number is a not multiple of 10.");
		}
	}
	}


