import java.util.Scanner;
public class StringJoiner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String firstname=sc.next();
		 String middlename=sc.next();
		 String lastname=sc.next();
		 String fullname=joinString(firstname,middlename, lastname);
		System.out.println("the fullname is=" +fullname);
		sc.close();
	}
 public static String joinString(String firstname,String middlename,String lastname) {
	 String name=(firstname+" " +middlename +"" +lastname);
	 return name;
	  
  }
}
