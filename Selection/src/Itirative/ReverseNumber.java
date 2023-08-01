package Itirative;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       for(int i=0; num>0 ;i++){
    	   int r=num%10;
    	   System.out.print(r);
    	   num=num/10;
       }
       sc.close();

}}
