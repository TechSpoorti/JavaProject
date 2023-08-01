import java.util.Scanner;
class Student{
String name;
int age;
void update(){
System.out.println("updated");
}
public static void main(String args[]){
 Student s=new Student();
 s.name="kanha";
 s.age=21;
 System.out.println("name=" +s.name);
 System.out.println("age=" +s.age);
 s.update();
}}
 