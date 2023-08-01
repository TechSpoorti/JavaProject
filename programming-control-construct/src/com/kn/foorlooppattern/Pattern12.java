package com.kn.foorlooppattern;

public class Pattern12 {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=7; i++) {
			if(i<=4) {
				k++;
			}
			else {
				k--;
			}
			for(int j=1; j<=7; j++) {
				if(k>=j ||k+j>=8) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
