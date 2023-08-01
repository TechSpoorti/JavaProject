package com.kod.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age= sc.nextInt();
		boolean flag = IsAdult(age);
		if (flag) {
			System.out.println("Adult");

		} else {
			System.out.println("child");

		}
		sc.close();
	}

	static boolean IsAdult(int age) {
		if (age> 21) {
			return true;	
		} else {
			return false;
		}

	}



	}


