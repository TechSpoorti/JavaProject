package com.kn.forloop;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		int n = 10;
		findSum(n);

	}

	public static void findSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("sum of first 10 natural numbers= " + sum);

	}

}
