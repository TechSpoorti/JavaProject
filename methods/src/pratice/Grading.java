package pratice;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a marks");
		int marks=sc.nextInt();
		if(marks>=90) {
			System.out.println("A Grade");
		}
		else if(marks>75&&marks<90) {
			System.out.println("B Grade");
		}
		else if(marks>50&&marks<75) {
			System.out.println("C Grade");
		}
		else if(marks>35&&marks<50) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("one more attempt");
		}
		sc.close();

	}

}
