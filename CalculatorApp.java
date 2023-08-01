import java.util.Scanner;
class CalculatorApp{
  static void addition()
  {
   System.out.println("Enter the 2 numbers for addition ");
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   System.out.println("sum=" +(a+b));
  }
 static void substration(int a,int b)
  {
 System.out.println("diff=" +(a-b));
  }
 static int multiplication()
  {
  System.out.println("Enter the 2 numbers for multiplication");
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   return a*b;
  }
 static double division(int a,int b)
  {
  return a/b;
  }
  static int modulusdivision(int a,int b)
  {
  return a%b;
  }
 static int average()
  {
  System.out.println("Enter the 2 numbers for average");
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   return a+b/2;
  }
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  addition();
  System.out.println("Enter the 2 numbers for substration");
  int a=sc.nextInt();
  int b=sc.nextInt();
  substration(a,b);
  int product=multiplication();
  System.out.println("product=" +product);
  System.out.println("Enter the 2 numbers for division");
  int c=sc.nextInt();
  int d=sc.nextInt();
  double q=division(c,d);
  System.out.println("quoient=" +q);
  System.out.println("Enter the 2 numbers for modulusdivision");
  int f=sc.nextInt();
  int g=sc.nextInt();
  int modulus=modulusdivision(f,g);
  System.out.println("modulus=" +modulus);
  int avg=average();
  System.out.println("average=" +avg);
}}
  