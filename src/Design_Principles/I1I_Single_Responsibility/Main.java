package Design_Principles.I1I_Single_Responsibility;


class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}


class EmployeePrinter {
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Base Salary: " + employee.getBaseSalary());
    }
}


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 1500000);
        EmployeePrinter.printEmployeeDetails(employee);
    }
}
