package CoreJava_java8._4_StreamAPI.Faq_Problms_1st_Priority_beforPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Solutions {

    public static void calculateMaleFemale(List<Employee> data) {

        long maleCount = data.stream()
                .filter(x -> x.getGender() == "Male")
                .count();
        System.out.println("maleCount is :" + maleCount);


        System.out.println("2nd Optimised solution: we're solving this by using groupBy \n ");
        Map<String, Long> allGenders = data.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(allGenders);

    }

    public static void allNamesDetails(List<Employee> data) {
        Map<String, Long> answer = data.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        System.out.println(answer);
    }

    public static void getOnlyDuplicateNames(List<Employee> data) {

        List<Map.Entry<String, Long>> list = data.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))

                .entrySet()
                .stream()
                .filter(e -> e.getValue() != 1)
                .collect(Collectors.toList());

        System.out.println(list);

    }

    public static void findDepartments(List<Employee> data) {
        List<String> departments = data.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(departments);

    }

    public static void averageAge(List<Employee> data) {
        Map<String, Double> average = data.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));

        System.out.println(average);
    }

    public static void findHighestPaid(List<Employee> data) {
        Optional<Employee> op = data.stream()
                .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()));

        if(op.isEmpty())
            System.out.println("No such employee present");
        else {
            Employee emp = op.get();
            System.out.println(emp);
        }
    }


    public static void getAllDetails(List<Employee> data) {
        List<Employee> list = data.stream()
                .filter(x -> x.getYearOfJoining() > 2015)
                .map(Solutions::empObj)
                .collect(Collectors.toList());

        System.out.println(list);
    }
    private static Employee empObj(Employee e){
        return new Employee(e.getName(), e.getYearOfJoining());
    }


    public static void countEmpNoFromDepartment(List<Employee> data) {
        Map<String, Long> count = data.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        // separate method for printing
        Set<Map.Entry<String, Long>> entries = count.entrySet();
        for(Map.Entry<String, Long> e : entries){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static void youngestMale(List<Employee> data) {
        Optional<Employee> emp = data.stream()
                .filter(x -> x.getDepartment() == "Product Development" && x.getGender() == "Male")

                // here we've to type on which data type we've to compare on [i've created descending sorting here]
                .sorted((a,b) -> Integer.compare(b.getAge(), a.getAge()))
                .findFirst();

        System.out.println(emp.get());
    }

}
