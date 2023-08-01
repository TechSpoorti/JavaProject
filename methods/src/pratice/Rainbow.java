package pratice;
import java.util.Scanner;

public class Rainbow {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			 System.out.println("Enter a char");
			 char c = scan.next().charAt(0);
			 if(c=='v'|| c=='V')
			 {
				 System.out.println("violet");
			 }
			 else if(c=='i'|| c=='I')
			 {
				 System.out.println("INDIGO");
			 }
			 else if(c=='b'|| c=='B')
			 {
				 System.out.println("blue");
			 }
			 else if(c=='g'|| c=='G')
			 {
				 System.out.println("green");
			 }
			 else if(c=='y'|| c=='Y')
			 {
				 System.out.println("yellow");
			 }
			 else if(c=='o'|| c=='O')
			 {
				 System.out.println("orange");
			 }
			 else if(c=='r'|| c=='R')
			 {
				 System.out.println("red");
			 }
			 else
			 {
				 System.out.println("not a Rainbow color");
			 }

			scan.close();
		}

	}


