package pratice;
import java.util.Scanner;
public class StudentsApp {

	public static void main(String[] args) {
		
		Students s=new Students();
		s.name="hari";
		s.rollnum=234;
		s.age=21;
		System.out.println("name=" +s.name );
		System.out.println("rollnum=" +s.rollnum );
		System.out.println("age=" +s.age );
		s.update();
	
	}

}
