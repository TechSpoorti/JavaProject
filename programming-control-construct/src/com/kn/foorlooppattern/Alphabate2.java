package com.kn.foorlooppattern;

public class Alphabate2 {
	public static void main(String args[]) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+(char)(64+i)+" ");
			}
			System.out.println();
		}}}

