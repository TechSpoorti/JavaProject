class PunariChai{
 static void makechai()
  {
  System.out.print("the bill for nrml chai=10");
  }
 static void makechai(int quantity)
  {
  System.out.println("the bill for nrml chai=" +(quantity*10));
  }
 public static void main(String[] args){
    makechai();
    makechai(5);
}}
  