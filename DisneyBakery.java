class DisneyBakery{
 static void makechai()
  {
  System.out.println("the bill for nrml chai=10");
  }
 static void makechai(int quantity)
  {
  System.out.println("the bill for nrml chai=" +(quantity*10));
  }
 static void makechai(String flavour)
  {
  System.out.println("the bill for " + flavour + "chai=20");
  }
 static void makechai(String flavour , int quantity)
  {
  System.out.println("the bill for " + flavour + "chai=" +(quantity*20));
  }
 public static void main(String[] args){
    makechai();
    makechai(5);
    makechai("ginger");
    makechai("lemon" ,6);
}}
  