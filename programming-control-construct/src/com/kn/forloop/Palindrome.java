package com.kn.forloop;

public class Palindrome {

	public static void main(String[] args) {
		int n=8971798,temp=n,r,sum=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			r=j%10;
			sum=sum*10+r;
			System.out.print(r);
			j=j/10;
			
			
		}
		if(temp==sum) {
			System.out.println("IS Palindrome");
		}else {
			System.out.println("Not");
		}

	}}}


