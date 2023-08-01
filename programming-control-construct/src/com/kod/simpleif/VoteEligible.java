package com.kod.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age= sc.nextInt();
		boolean flag = IsEligibleforVote(age);
		if (flag == true) {
			System.out.println("Vote Eligible");

		} else {
			System.out.println("Not Eligible");

		}
		sc.close();
	}

	static boolean IsEligibleforVote(int age) {
		if (age>=18) {
			return true;	
		} else {
			return false;
		}

	}

}
