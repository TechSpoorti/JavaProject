import java.util.Scanner;

public class Vibgyor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alaphabet=");
		char c = sc.next().charAt(0);
		switch (c) {// where c case label
		case 'v':
		case 'V':
			System.out.println("voilet");
			break;
		case 'i':
		case 'I':
			System.out.println("indigo");
			break;
		case 'b':
		case 'B':
			System.out.println("blue");
			break;
		case 'g':
			System.out.println("green");
			break;
		case 'y':
			System.out.println("yellow");
			break;
		case 'o':
			System.out.println("orange");
			break;
		case 'r':
			System.out.println("red");
			break;
		default:
			System.out.println("invalid input");
		}
		System.out.println("The End ");
		sc.close();

	}

}
//fall through mechanism