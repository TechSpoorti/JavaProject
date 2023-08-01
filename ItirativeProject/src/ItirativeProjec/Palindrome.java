package ItirativeProjec;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int r,sum=0;
while(num>0) {
	r=num%10;
	sum=sum*10+r;
	num=num/10;
}
System.out.println(sum);
sc.close();
	}

}
