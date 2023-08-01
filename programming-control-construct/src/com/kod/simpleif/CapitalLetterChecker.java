package com.kod.simpleif;

import java.util.Scanner;

public class CapitalLetterChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		boolean CapitalLetter = isCapitalLetter(ch);

		if (CapitalLetter) {
			System.out.println("The character " + ch + " is a capital letter.");
		} else {
			System.out.println("The character " + ch + " is not a capital letter.");
		}
		sc.close();
	}

	static boolean isCapitalLetter(char ch) {
		return Character.isUpperCase(ch);

	}
}
