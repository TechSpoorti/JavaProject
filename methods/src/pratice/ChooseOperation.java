package pratice;
import java.util.Scanner;

public class ChooseOperation {
	public static void main(String[] args) {
			System.out.println("choose the operators: '+' '-' '*' '/'");
			System.out.println("+ --> Addition");
			System.out.println("- --> Subtraction");
			System.out.println("* --> Multiplication");
			System.out.println("/ --> Division");
			Scanner scan = new Scanner(System.in);
			 char c = scan.next().charAt(0);
			 System.out.println("Enter 2 numbers for " +c);
			 int a = scan.nextInt();
			 int b = scan.nextInt();
			 
			 if(c=='+')
			 {
				 System.out.println("Sum of given 2 numbers" +a+" " +b+" =" + (a+b));
			 }
			 if(c=='-')
			 {
				 System.out.println("difference of given 2 numbers" +a+" " +b+" =" + (a-b));
			 }
			 if(c=='*')
			 {
				 System.out.println("product of given 2 numbers" +a+" " +b+" =" + (a*b));
			 }
			 if(c=='/')
			 {
				 System.out.println("division of given 2 numbers" +a+" " +b+" =" + (a/b));
			 }
			 
			 
			 
			 scan.close();
			 
				 
		}

	}

