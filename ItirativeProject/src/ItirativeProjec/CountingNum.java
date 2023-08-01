package ItirativeProjec;

import java.util.Scanner;

public class CountingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int r,count=0;
		while(num>0) {
			r=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
		sc.close();

	}

}
