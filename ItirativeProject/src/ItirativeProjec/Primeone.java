package ItirativeProjec;

public class Primeone {

	public static void main(String[] args) {
		int n = 10, count = 0;
		for (int i = 2; i <= 10; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
