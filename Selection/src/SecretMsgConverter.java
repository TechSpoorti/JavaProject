import java.util.Scanner;

public class SecretMsgConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
   System.out.println("the decoded message is =" +decodeCharacter(ch));//instead of creating another variable direct call the method
   sc.close();
	}

	public static int decodeCharacter(char message) {
		return message;
	}

}
