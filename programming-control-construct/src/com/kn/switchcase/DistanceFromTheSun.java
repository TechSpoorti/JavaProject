package com.kn.switchcase;

import java.util.Scanner;

public class DistanceFromTheSun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String planet = sc.next();
		ordersFromSun(planet);
		sc.close();

	}

	public static String ordersFromSun(String planet) {
		switch (planet) {
		case "Mercury":
			System.out.println(1);
			break;
		case "Venus":
			System.out.println(2);
			break;
		case "Earth":
			System.out.println(3);
			break;
		case "Mars":
			System.out.println(4);
			break;
		case "Jupiter":
			System.out.println(5);
			break;
		case "Satrus":
			System.out.println(6);
			break;
		case "Urenus":
			System.out.println(7);
			break;
		case "Neptune":
			System.out.println(8);
			break;
		default:
			System.out.println("Invalid i/p");
		}
		return "The End";

	}
	}

