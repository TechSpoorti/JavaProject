package com.kn.foorlooppattern;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			int count=1;
			for(int j=1; j<=3; j++) {
				if(i+j>=4) {
					System.out.print(count);
					count++;
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
