package com.kn.foorlooppattern;

public class Number12 {

	public static void main(String[] args) {
		int count=1;
		for (int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				
				if(i>=j) {
					System.out.print(count+" ");
					count++;
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
