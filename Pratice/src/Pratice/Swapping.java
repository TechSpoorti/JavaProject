package Pratice;

public class Swapping {

	public static void main(String[] args) {
      int a=10,b=20;
      System.out.println("before Swapping a=" +a);
      System.out.println("Before Swapping b=" +b);
      a=b+a;
      b=a-b;
      a=a-b;
      System.out.println("After Swapping a=" +a);
      System.out.println("Aftern Swapping b=" +b);
	}

}
