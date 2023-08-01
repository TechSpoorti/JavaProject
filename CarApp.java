class CarApp{
 public static void main(String args[]){
  Car c1=new Car();
  c1.price=5000000;
  c1.color="black";
  c1.brand="kia";
  System.out.println("price=" +c1.price);
  System.out.println("price=" +c1.color);
  System.out.println("price=" +c1.brand);
  c1.drive();
  c1.honk();
}}
 