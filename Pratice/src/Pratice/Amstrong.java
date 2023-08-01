package Pratice;

public class Amstrong {

	public static void main(String[] args) {
		int n = 153;
		int r, sum = 0, temp;
		temp = n;
		while (n > 0) {
			r = n % 10;
			r = r * r * r;
			sum += r;
			n = n / 10;

		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("the number is Amstrong");
		}
	}
}
