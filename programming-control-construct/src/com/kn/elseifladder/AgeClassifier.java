package com.kn.elseifladder;
import java.util.Scanner;

public class AgeClassifier {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("enter a age");
				int age = scan.nextInt() ;
				int ageclassifier = ageclassifier(age);
				System.out.println(ageclassifier);
				scan.close();
						
			}

			private static int ageclassifier(int age) {
				if(age>=0 && age<=12) {
					System.out.println("child");
				}
				else if(age>=13 && age<=19) {
					System.out.println("teenage");
				}
				else if(age>=20 && age<=59) {
					System.out.println("adult");
				}
				else if(age>=60) {
					System.out.println("senior");
				}
				else {
					System.out.println("invalid input");
				}
				return age;
			}

		
	}


