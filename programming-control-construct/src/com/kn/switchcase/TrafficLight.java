package com.kn.switchcase;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color = sc.next();
		instrutions(color);
		sc.close();

	}

	public static String instrutions(String color) {
		switch (color) {
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("Ready to go");
			break;
		case "yellow":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid i/p");
		}
		return "The End";

	}



	}


