package com.kn.forloop;

public class SquareNum {

	public static void main(String[] args) {
		int n = 10;
		squareNum(n);

	}

	private static void squareNum(int n) {
		for (int i = 1; i <= n; i++) {
			int square = i * i;
			System.out.println("Square of " + i + "=" + square);
		}
	}

}
