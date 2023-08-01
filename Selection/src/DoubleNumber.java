import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ") ;
		int num=sc.nextInt();		
      int doubleNumber=doubleTheNumber(num);
      System.out.println("The double of givennumber is :" +doubleNumber);
      sc.close();
	}

	public static int doubleTheNumber(int num) {
		return num+num;//num*2 //num*num
	}

}
