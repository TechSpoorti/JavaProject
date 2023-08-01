package pratice;

import java.util.Scanner;

public class methods {
	public static void main(String args[]) {
		greeating();
		findsum();
		findsum( 1100, 2000);
	}
  static void greeating() {
	  System.out.println("good morning");
  }
  static void findsum() {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("sum=" +(a+b));
  }
  static void findsum(int a,int b) {
	  System.out.println("sum=" +(a+b));
  }
 
}
