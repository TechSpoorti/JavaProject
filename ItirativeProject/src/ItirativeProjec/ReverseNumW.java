package ItirativeProjec;

import java.util.Scanner;

public class ReverseNumW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num > 0) {
			int r = num % 10;
			System.out.print(r);
			num = num / 10;
		}
		sc.close();
	}

}
