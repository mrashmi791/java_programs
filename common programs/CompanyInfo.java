import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    String address;
    int salary;

    void display(int emp_id, String emp_name, String address, int salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.address = address;
        this.salary = salary;
        System.out.println(emp_id + "---->" + emp_name + "---->" + address + "---->" + salary);
    }
}

class CompanyInfo extends Employee {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        int id = sc.nextInt();
        System.out.println("Enter employee name");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter employee address");
        String add = sc.nextLine();

        System.out.println("Enter employee salary");
        int salary = sc.nextInt();
        Employee emp = new Employee();
        emp.display(id, name, add, salary);
    }

}