package ItirativeProjec;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r, sum = 0;
		while (num > 0) {
			r = num % 10;
			sum = sum + r;
            num = num / 10;
		}
		System.out.print(sum);

		sc.close();
	}

}
