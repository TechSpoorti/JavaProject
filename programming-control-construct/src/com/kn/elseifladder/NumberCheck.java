package com.kn.elseifladder;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(numberCheck(num));
		sc.close();
	}

 public static String numberCheck(int num) {
	 if (num==0) {
			return "zero";
		} else  if(num>0) {
			return "+ve";
		}else {
			return "-ve";
		}		
	}

}
