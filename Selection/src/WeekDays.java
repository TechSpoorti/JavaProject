import java.util.Scanner;
public class WeekDays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a week");
		String weekdays=sc.next();
		switch(weekdays) {
		case "mon":
			System.out.println("Start headache");
			break;
		case "tue":
			System.out.println("not that so good");
			break;
		case "wen":
			System.out.println("cool");
			break;
		case "thur":
			System.out.println("nthg to do");
			break;
		case "fir":
			System.out.println("rush to finish work");
			break;
		case "sat":
			System.out.println("cleaning");
			break;
		case "sun":
			System.out.println("only sleep");
			break;
		default:
			System.out.println("sick");
		}
  sc.close();
	}

}
