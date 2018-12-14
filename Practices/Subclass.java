class Superclass{
int age;
Superclass(int age){
this.age=age;
}
public void getAge(){
System.out.println("The value of age  is: " +age);
}
}
public class Subclass extends Superclass {
Subclass(int age){
super(age);
}
public static void main(String[] ar){
Subclass s= new Subclass(30);
s.getAge();
}
}
