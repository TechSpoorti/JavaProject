package com.kn.switchcase;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char grade = scan.next().charAt(0);
		scorerange(grade);
		scan.close();

	}

	public static void scorerange(char grade) {
		switch (grade) {
		case 'A':
			System.out.println(95);
			break;
		case 'B':
			System.out.println(80);
			break;
		case 'C':
			System.out.println(70);
			break;
		case 'D':
			System.out.println(60);
			break;
		case 'F':
			System.out.println(0);
			break;
		default:
			System.out.println("Invalid input");

		}
		return;

	}

}
