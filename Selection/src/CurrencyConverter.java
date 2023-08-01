import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rupee = sc.nextInt();
		System.out.println("INR to $ =" + currencyTODollar(rupee) + "$");
		System.out.println("INR to Pound =" + currencyTOPound(rupee));
		sc.close();
	}

	public static double currencyTOPound(int rupee) {
		return rupee * 0.012;
	}

	private static double currencyTODollar(int rupee) {
		return rupee * 0.0095;
	}

}
