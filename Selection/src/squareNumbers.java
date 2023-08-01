import java.util.Scanner;
public class squareNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int squareNum=squareNumber(a);
		System.out.println("result =" +squareNum);
		sc.close();

	}

	private static int squareNumber(int a) {
		return a*a;
	}
	

}
