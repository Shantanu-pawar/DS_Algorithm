package Design_Patterns.Creational.d_Builder;

class Run{
    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder()
                .setId(232)
                .setEmpName("dadu's Pritching")
                .setBuilding("AB")
                .build();

        System.out.println(emp);
    }
}

public class Employee {
    private int id;
    private String empName;
    private String department;
    private String building;
    private String address;
    private String phoneNo;

    // set getter here and setter in builder class
    public int getId() {
        return id;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    public String getBuilding() {
        return building;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Employee(int id, String empName, String department, String building, String address, String phoneNo) {
        this.id = id;
        this.empName = empName;
        this.department = department;
        this.building = building;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + id +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", building='" + building + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}

class EmployeeBuilder {
    private int id;
    private String empName;
    private String department;
    private String building;
    private String address;
    private String phoneNo;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setBuilding(String building) {
        this.building = building;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public Employee build() {
        return new Employee(id,empName,department,building,address,phoneNo);
    }
}

