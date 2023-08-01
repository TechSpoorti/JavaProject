import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature in Fahrenheit : ");
		int f=sc.nextInt();
		System.out.println(+f+"F");
		//double temperatureconverted= temperatureconverter(f);
		System.out.println("Temperature from Fahrenheit is converted into Celsius " + temperatureconverter( f)+"C");
      sc.close();
	}
   public static double temperatureconverter(int f) {
	   return ((f - 32) * 5)/9;
   }
}
