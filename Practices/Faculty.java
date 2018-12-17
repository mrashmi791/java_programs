import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SchoolEmployee {
    String name;
    int salary;
    String job;

    SchoolEmployee(String name,int salary,String job) {
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

void getInfo() {
    System.out.println(this.name);
     System.out.println(this.salary);
      System.out.println(this.job);
}
}
class Faculty extends SchoolEmployee {
 Faculty(String name,int salary,String job) {

    super(name,salary,job);
    //this.getInfo();
 }

public static void main(String[] ar) {
    Scanner sc = new Scanner(System.in);

    List<Faculty> lf = new ArrayList<Faculty>();

    for(int i=0; i < 2; i++) {

        System.out.println("Enter "+ i+1 + " value:");
        String name = sc.nextLine();
        int salary = sc.nextInt();
        sc.nextLine();
        String job = sc.nextLine();
        Faculty f = new Faculty(name,salary,job);
        lf.add(f);
        //f.getInfo();
    }

    for(Faculty fc: lf) {
        fc.getInfo();
    }
    }
}