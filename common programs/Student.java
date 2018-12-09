import java.util.Scanner;

class Student {
    int roll;
    double marks;
    String name;

    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Roll");
        roll = sc.nextInt();
        System.out.println("Enter Marks");
        marks = sc.nextInt();
        System.out.println(name + roll + marks);
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        Student s = new Student();
        s.display();
    }
}