package com.kn.forloop;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double series=findSeries( n) ;
		System.out.println(series);
		sc.close();
	}
	public static double findSeries(int n) {
		double sum=0.0;
		for(double i=1;i<=n;i++) {
			sum=sum+1/i;
			}
		
		return sum;
	}

	}


