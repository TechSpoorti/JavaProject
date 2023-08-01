package com.kn.forloop;

public class Amstrong {

	public static void main(String[] args) {
		int n=500;int r, num;
		for(int j =1 ;j<=n;j++) {
			num=j;
			int sum = 0;
			for(;num>0;) {
				r = num % 10;
				r = r * r * r;
				sum += r;
				num = num/ 10;
				
			}
			if(sum==j) {
				System.out.println(j);
			}
		}
		
	}


}





