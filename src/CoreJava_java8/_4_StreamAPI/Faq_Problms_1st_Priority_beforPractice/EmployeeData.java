package CoreJava_java8._4_StreamAPI.Faq_Problms_1st_Priority_beforPractice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    // so for managing this data seperately i'm using like this! so that i can perform functions
    public static List<Employee> data(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(277, "Nima Roy", 31, "Female", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}
