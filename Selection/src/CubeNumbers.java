import java.util.Scanner;

public class CubeNumbers {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=sc.nextInt();
			int cubedNumber=cubeNumber(a);
			System.out.println("THe cube of given number =" +cubedNumber);
			sc.close();

		}

		private static int cubeNumber(int a) {
			return a*a*a;
		}
		

	}


