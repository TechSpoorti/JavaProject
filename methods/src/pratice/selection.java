package pratice;
import java.util.Scanner;
public class selection {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		if(a>0) 
			System.out.println("given number is +ve");
		else
			System.out.println("given num is -ve");
		
	}

}
