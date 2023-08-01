package com.kod.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = IsPositiveNumber(n);
		if (flag == true) {
			System.out.println("The given number " + n + " is positive");

		} else {
			System.out.println("The given number" + n + "is negative");

		}
		sc.close();
	}

	static boolean IsPositiveNumber(int n) {
		if (n > 0) {
			return true;
		} else {
			return false;
		}

	}

}
