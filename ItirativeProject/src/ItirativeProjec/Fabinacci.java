package ItirativeProjec;

public class Fabinacci {

	public static void main(String[] args) {
		int firstNum = 0, n = 10, secondNum = 1, nextNum = 0;
		System.out.print(firstNum + " " + secondNum + " ");
		for (int i = 3; i <= n; i++) {
			nextNum = firstNum + secondNum;
			System.out.print(nextNum + " ");
			firstNum = secondNum;
			secondNum = nextNum;
		}

	}

}
