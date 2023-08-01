import java.util.Scanner;

public class SemesterMarksAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the semester marks :");
		int firstsem = sc.nextInt();
		int secondsem = sc.nextInt();
		int thirdsem = sc.nextInt();
		int fourthsem = sc.nextInt();
		int fifthsem = sc.nextInt();
		int sixthsem = sc.nextInt();
		int seventhsem = sc.nextInt();
		int eightsem = sc.nextInt();
		System.out.println("The 1st sem marks is : " + firstsem);
		System.out.println("The 2nd sem marks is : " + secondsem);
        System.out.println("The 3rd sem marks is : " + thirdsem);
        System.out.println("The 4th sem marks is : " + fourthsem);
        System.out.println("The 5th sem marks is : " + fifthsem);
        System.out.println("The 6th sem marks is : " + sixthsem);
        System.out.println("The 7th sem marks is : " + seventhsem);
        System.out.println("The 8th sem marks is : " + eightsem);
		// double averageMarks=calculateAverage(firstsem,secondsem,thirdsem,fourthsem,fifthsem,sixthsem,seventhsem,eightsem);
		System.out.println("the average marks over 8 semesters is : "
				+ calculateAverage(firstsem, secondsem, thirdsem, fourthsem, fifthsem, sixthsem, seventhsem, eightsem));
		sc.close();
	}

	public static double calculateAverage(int firstsem, int secondsem, int thirdsem, int fourthsem, int fifthsem,
			int sixthsem, int seventhsem, int eightsem) {

		return ((firstsem + secondsem + thirdsem + fourthsem + fifthsem + sixthsem + seventhsem + eightsem) / 8f);
	}

}
