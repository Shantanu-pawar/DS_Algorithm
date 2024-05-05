package CoreJava_java8._4_StreamAPI.Interview_problmStatements;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class I1I_sort_Obj_By_Locations {
    public static void main(String[] args) {

 /* TASK - find all emp whos location is dhule then i'll convert those employeeList
            into uppercase and sort them descending ly on their names  */
        filterEmployeeList();
    }

    static void filterEmployeeList(){
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(19, "magan", Address.america));
        empList.add(new Employee(13, "chagan", Address.dhule));
        empList.add(new Employee(143, "karan", Address.dubai));
        empList.add(new Employee(3, "Acharan", Address.dhule));

        System.out.println("\n printed sorted emp names from specific location");
        List<String> collect = empList.stream()
                .filter(e -> e.getAddress() == Address.dhule)
                .map(e -> e.getName().toUpperCase()) // just converting the name into UpperCase
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}


class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString(){
        return "{Employee : id = " + id +", name : " + name + ", address :" + address +"}";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}

enum Address{
    dhule, mumbai, america, dubai
}