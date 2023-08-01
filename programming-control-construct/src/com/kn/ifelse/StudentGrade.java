package com.kn.ifelse;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		System.out.println(gradeCheck(marks));
		sc.close();
	}

	static String gradeCheck(int marks) {
		if (marks > 50) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

}
