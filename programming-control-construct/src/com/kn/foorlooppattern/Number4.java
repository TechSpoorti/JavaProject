package com.kn.foorlooppattern;

public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }

	}

}
