package Itirative;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num=sc.nextInt();
		for(int i=0; i<=10; i++) {
			int n=num*i;
			System.out.println("5*"+i+"=" +n );
			sc.close();
			
		}
	}

}
