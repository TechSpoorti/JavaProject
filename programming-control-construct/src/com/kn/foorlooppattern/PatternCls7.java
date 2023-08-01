package com.kn.foorlooppattern;

public class PatternCls7 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				if(i+j<=10) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
		}
			System.out.println();
	}

}}
