package ItirativeProjec;

public class BreakStatement {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 1; i <= num; i++) {
			if (i%7 == 0) {
				break;
			} else {
				System.out.println(i);

			}
			System.out.println("inside loop");
		}
		System.out.println("outside loop");
	}
}
