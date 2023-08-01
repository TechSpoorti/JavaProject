 import java.util.Scanner;
 class EndUserInput1{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter your age=");
  int age=sc.nextInt();
  System.out.println("your age is=" + age);
  System.out.print("Enter ur name=");
  sc.nextLine();//bcz its treated entred as the String,tht's y we use this.
  String name=sc.nextLine();
  //String name=sc.next();
  System.out.println("your name is=" +name);
}}
  