package com.kn.ifelse;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		checkNum(num);
		sc.close();
	}

	static void checkNum(int num) {
		if (num > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}

}
