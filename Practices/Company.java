import java.util.Scanner;

class Company {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String address = sc.nextLine();
        String dept = sc.nextLine();
        int deptId = sc.nextInt();
        int salary = sc.nextInt();
        int mobile = sc.nextInt();
        int comm = sc.nextInt();

        EmployeeInfo emp = new EmployeeInfo(name,dept,deptId,address,salary,mobile,comm);
        emp.getEmployee();
        //System.out.println(emp.mobile);

    }
}