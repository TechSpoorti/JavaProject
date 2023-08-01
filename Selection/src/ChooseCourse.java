import java.util.Scanner;

public class ChooseCourse {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks got in btech=");
int marks=sc.nextInt();
if(marks==90) {
	System.out.println("Do Master's in AI");
}
else if(marks>=75 && marks<90) {
	System.out.println("Do IOT");
	
}
else if(marks>=60 && marks<75) {
	System.out.println("Do NT");
	
}
else if(marks>=45 && marks<60) {
	System.out.println(" Do cc");
	
}
else {
	System.out.println("Go for IT job");
}
sc.close();
	}

}
