package com.kn.elseifladder;
import java.util.Scanner;

public class StudentClassifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a score");
		int score = scan.nextInt();
	    studentclassifier(score);
		scan.close();

	}

	static int studentclassifier(int score) {
		if (score >= 90 && score <= 100) {
			System.out.println('A');

		}

		else if (score >= 80 && score <= 89) {
			System.out.println('B');
		} else if (score >= 70 && score <= 79) {
			System.out.println('C');
		} else if (score >= 60 && score <= 69) {
			System.out.println('D');
		} else if (score <= 100) {
			System.out.println('E');
		} else {
			System.out.println("invalid input");
		}

		return score;
	}

}
