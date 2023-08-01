package com.kod.simpleif;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int purchaseamount= sc.nextInt();
		boolean flag = IsDiscountApllicable(purchaseamount);
		if (flag == true) {
			System.out.println("Discount Apllicable");

		} else {
			System.out.println("Discount  is not Apllicable");

		}
		sc.close();
	}

	static boolean IsDiscountApllicable(int purchaseamount) {
		if (purchaseamount> 100) {
			return true;	
		} else {
			return false;
		}


	}

}
