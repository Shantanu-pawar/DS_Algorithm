package CoreJava_java8._4_StreamAPI.PracticeProblms.ImpProblm_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_functions {
    public static void main(String[] args) {

        StreamIteration();
//        filterOperation();
//        filterEmployeeList();
//        filterTheList();
//        filterTheArray();
    }


    static void filterEmployeeList(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(19, "magan", Address.america));
        empList.add(new Employee(13, "chagan", Address.dhule));
        empList.add(new Employee(143, "karan", Address.dhule));
        empList.add(new Employee(3, "Acharan", Address.dhule));

    /* TASK :
     now here i wanted to find all emp who's location is dhule then i'll convert
     those employeeList into uppercase and then i'll sort the employees
     from their names
    */

        // first print all employees
        for(Employee emp : empList){
//            System.out.println(emp);
        }

        System.out.println("\n printed sorted emp names from specific location");
        empList.stream().filter(e -> e.getAddress() == Address.dhule)
                .map(e -> e.getName().toUpperCase()).sorted()
                .forEach(e -> System.out.println("employee Name = " + e));
    }


    static void filterTheArray(){
        /* here we'll learn : how to perform stream api on arrays and short it down
        *  here m just finding the elements > 7 and add +10 in those elements  */

        int []arr = {31, 13, 26, 7, 9};

        Arrays.stream(arr)
                .filter(x -> x > 7)
                .map(x -> x + 10) // we can access each value and perform some operation on it/
                .forEach(x -> System.out.print(x + " "));

        // suppose i wanted to collect all those elements into an array
        // collect : by using .collect we can literally collect the elements into another arr.

        int [] ans = Arrays.stream(arr)
                .filter(x -> x>7)
                .toArray();

        System.out.println("\n \n collected elements from arr into another ans");
        System.out.print(Arrays.toString(ans));
    }


//    learned : how to iterate List using streams and store into another List.
    static void StreamIteration() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,23,43,32,234,23,2));

        // iterations using stream API and store it into another list
        List<Integer> collectedElements = list.stream().collect(Collectors.toList());

        // after collecting, we're simply iterating the list.
        collectedElements.stream().forEach(x -> System.out.print(x + " "));
    }


    static void filterTheList(){
        List<Integer> obj = new ArrayList<>(Arrays.asList(12, 56, 89, 98));

        /* Question : find the element who is greater than 60 | then i've divided [no/2] + 1
        * and then sort it out
        * */

        obj.stream().filter(x -> x > 60)
                .map(x -> (x/2) + 1)
                .sorted()
                .forEach(x -> System.out.print(x + " "));
    }
}