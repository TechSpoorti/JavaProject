package pratice;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter an integer value=");
 int a = sc.nextInt();
 System.out.println("enter an another integer value=");
 int b = sc.nextInt();
 Calculator c = new Calculator();
 c.add(a,b);
 c.sub(a,b);
 c.mul(a,b);
 c.div(a,b);
 c.mod(a,b);
}}
