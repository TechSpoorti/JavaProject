package com.kn.forloop;

public class Fibinaaci {

	public static void main(String[] args) {
		int firstNum = 0, secondNum = 1;
		System.out.print(firstNum + " " + secondNum + " ");
		findNextNum(firstNum, secondNum);

	}

	public static void findNextNum(int firstNum, int secondNum) {
		int n = 10, nextNum = 0;
		for (int i = 1; i <= n; i++) {
			nextNum = firstNum + secondNum;
			System.out.print(nextNum + " ");
			firstNum = secondNum;
			secondNum = nextNum;

		}

	}

}
