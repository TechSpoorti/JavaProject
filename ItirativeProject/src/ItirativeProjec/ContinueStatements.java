package ItirativeProjec;

public class ContinueStatements {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			if (i%3 == 0) {
				continue;
			} else {
				System.out.println(i);

			}
			System.out.println("inside loop");
		}
		System.out.println("outside loop");
	}
	}

