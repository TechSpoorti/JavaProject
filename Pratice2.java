import java.util.Scanner;
class Pratice2{
 public static void main(String args[]){
  System.out.println("Enter the two values ");
  Scanner sc=new Scanner(System.in);
  int j=sc.nextInt();
  int k=sc.nextInt();
  div(j,k);
  moduls(j,k);
  sum(j,k);
  sub(j,k);
  mul(j,k);
}
 static void sum(int j,int k){
  System.out.println("sum=" +(j+k));
}
 static void sub(int j,int k){
  System.out.println("diff=" +(j-k));
}
static void mul(int j,int k){
  System.out.println("mul=" +(j*k));
}
static void div(int j,int k){
  System.out.println("div=" +(j/k));
}
static void moduls(int j,int k){
  System.out.println("modulus=" +(j%k));
}}