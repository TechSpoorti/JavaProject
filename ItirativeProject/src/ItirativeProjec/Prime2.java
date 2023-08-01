package ItirativeProjec;

public class Prime2 {

	public static void main(String[] args) {
		int n=10;
		boolean isPrime=true;
		for(int i=2;i<=n; i++) {
			if(i%n==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
