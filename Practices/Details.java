class Employee {
    String name = "Krishna";
    String dept = "medical";
    void print() {
    System.out.println(name ); 
    System.out.println(dept ); 
    }
}
class Manager extends Employee {
    int id = 1234;
    void dis() {
       System.out.println(id);
    }
}
class Details {
     public static void main(String[] ar) {
        Manager d = new Manager();
         d.dis();
         d.print();
     }
}