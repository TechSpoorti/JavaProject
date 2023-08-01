import java.util.Scanner;

public class ArthmeticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char c = sc.next().charAt(0);
		switch (c) {
		case '-':
			subtractNumbers(num1, num2);
			System.out.println("difference=" + (num1 - num2));
			break;
		case '+':
			additiontNumbers(num1, num2);
			System.out.println("addition=" + (num1 + num2));
			break;
		case '*':
			multiplyNumbers(num1, num2);
			System.out.println("product=" + (num1 * num2));
			break;
		case '/':
			divideNumbers(num1, num2);
			System.out.println("divide=" + (num1 / num2));
			break;
		case '%':
			findReminder(num1, num2);
			System.out.println("modulus=" + (num1 % num2));

		}
		sc.close();
	}
	public static int additiontNumbers(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	public static double divideNumbers(int num1, int num2) {
		return num1 / num2;
	}

	public static int findReminder(int num1, int num2) {
		return num1 % num2;
	}

}
