import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int t=sc.nextInt();
    int r=sc.nextInt();
    System.out.println("Simple intrest is= " +calculateSimpleIntrest(p,t,r));
    sc.close();
	}

	public static int  calculateSimpleIntrest(int p, int t, int r) {
		return (p*t*r)/100;
	}

}
