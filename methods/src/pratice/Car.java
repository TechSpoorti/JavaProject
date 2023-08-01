package pratice;

public class Car {
	String color;
	String company;
	int price;
	void drive() {
		System.out.println("drive upto 100km");
	}
	void honk() {
		System.out.println("kiiiikikiii");
	}
	public Car(String color, String company, int price) {
		super();
		this.color = color;
		this.company = company;
		this.price = price;
	}
		

}
