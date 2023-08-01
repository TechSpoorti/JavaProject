package com.kn.forloop;

public class PrimeNum {

	public static void main(String[] args) {
		int range=100,count;
		for(int j=1;j<=range;j++) {
			count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}}
				if(count==2) {
					System.out.println(j);
				}
			}
		}
		

	}


