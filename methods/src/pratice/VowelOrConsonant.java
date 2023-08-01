package pratice;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charecter");
		char c=sc.next().charAt(0);
		if(c=='a'||c=='A') {
			System.out.println("Vowel");
		}
		else if(c=='e'||c=='E') {
			System.out.println("Vowel");
		}
		else if(c=='i'||c=='I') {
			System.out.println("Vowel");
		}
		else if(c=='o'||c=='O') {
			System.out.println("Vowel");
		}
		else if(c=='u'||c=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonant");
		}
	}

}
