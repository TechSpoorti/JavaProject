package com.kn.forloop;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		int fct=factorial(n);
		System.out.println("the factorial of given number is=" +fct);
	}

	public static int factorial(int n) {
		int fact=1;
		for(int i=1; i<=n;i++) {
			return fact=fact*i;
	
			
		}
		return fact;
		
	}

}
