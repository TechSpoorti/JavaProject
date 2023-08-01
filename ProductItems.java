class ProductItems{
  public static void main(String args[]){
   Curd c1=new Curd();
   c1.product_id=12357;
   System.out.println("product_id=" +c1.product_id);
   c1.category="Diary_product";
   System.out.println("category=" +c1.category);
   c1.price=10;
   System.out.println("category=" +c1.price);
   c1.manufacture();
   c1.sold();
   c1.shipped();
   Clothes c2= new Clothes();
   c2.product_id=890766;
   System.out.println("product_id=" +c2.product_id);
   c2.category="Menswear, Women's wear and Kids wear";
   System.out.println("category=" +c2.category);
   c2.price=1000;
   System.out.println("category=" +c2.price);
   c2.manufacture();
   c2.sold();
   c2.shipped();
   
}}