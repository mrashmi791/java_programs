class EmployeeInfo {
    String name;
    String dept;
    int deptId;
    String address;
    int salary;
    private int mobile;
    private int comm;


    EmployeeInfo(String name, String dept, int deptId, 
    String address, int salary, int mobile, int com) {
        this.name = name;
        this.dept = dept;
        this.deptId = deptId;
        this.address = address;
        this.salary = salary;
        this.mobile = mobile;
        this.comm = com;


    }

    void getEmployee() {
        System.out.println(this.name);
        System.out.println(this.dept);
        System.out.println(this.deptId);
        System.out.println(this.address);
        System.out.println(this.salary);
        System.out.println(this.mobile);
        System.out.println(this.comm);
    }
}