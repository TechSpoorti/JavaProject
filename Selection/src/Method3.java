import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
    int res=findSum();
    System.out.println("the sum of two numbers is = " +res);
    
	}
public static int findSum() {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int result=a+b;
	return result;
	
}

}
