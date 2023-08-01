import java.util.Scanner;

public class DistanceCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a speed : ");
		double speed = sc.nextDouble();
		System.out.println("enter a time : ");
		double time = sc.nextDouble();
		double distance = calculateDistance(speed, time);
		System.out.println("Distance=" + distance);
		sc.close();

	}

	public static double calculateDistance(double speed, double time) {

		return speed * time;
	}

}
