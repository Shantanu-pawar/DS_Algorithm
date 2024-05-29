package CoreJava_java8._4_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Convert{
    static Student mapToStudent(Student student){
        Student s = new Student(student.getName(), student.getSalary(),
                student.getLocation());
        return s;
    }

}

public class I2I_ObjectBased_Questions_IMP {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student( "shashwat",  100, "chennai"),
                new Student("ganesh",  20, "pune-mumbai"),
                new Student("aniket",  30, "chennai"),
                new Student("mangesh",  90, "chennai"),
                new Student("ganesh",  10, "chennai")
        ));

 /* Question: write a program to return all the duplicate student objects by using stream API */
//        countFrequencyOfEachName(studentList);

/*  find all sum of salaries from this objects */
//        sumOfSalaries(studentList);

/* convert this list into map, where we can find all the elements sorted */
//        storeThisListToMap(studentList);

/* find the obj by location, then sort the object based on name */
//        sortStudentByLocation(studentList);

/* find duplicate names from this studentList */
//        duplicateNameObject(studentList);
        excludeDuplicateNames(studentList);


    }

    private static void excludeDuplicateNames(List<Student> studentList) {
        List<String> ans = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()))
                .entrySet()

                // now filter that entry set
                .stream().filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        System.out.println(ans);
    }

    private static void duplicateNameObject(List<Student> studentList) {

        Set<Map.Entry<String, Long>> entries = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()))
                .entrySet();

        List<String> ans = entries.stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(ans);
    }

    private static void sortStudentByLocation(List<Student> studentList) {

        List<Student> collect = studentList.stream()
                .filter(s -> Objects.equals(s.getLocation(), "chennai")) // when we wann filter by location
//                .filter(s -> s.getSalary() > 80) // filter by salary

                // used method reference here
                .map(Convert::mapToStudent)

                // it defines on what basis you wanna sort the object
                .sorted(Comparator.comparing(Student::getName))

                .collect(Collectors.toList());

        System.out.println(collect);
    }



    private static void storeThisListToMap(List<Student> studentList) {
        // here i've sorted it by name as key [we can also sort it by salary]

        TreeMap<String, String> sortedObj = studentList.stream()
                .collect(Collectors.toMap(
                        Student::getName, Student::getLocation,
                        (a, b) -> a,
                        () -> new TreeMap<>(Comparator.naturalOrder())
                ));

        System.out.println(sortedObj);
    }


    private static void sumOfSalaries(List<Student> studentList) {
        int salarySum = studentList.stream()
                .mapToInt(Student::getSalary)
                .sum();

        System.out.println(salarySum);
    }

    private static void countFrequencyOfEachName(List<Student> studentList) {

        Map<String, Long> frequencyMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        // Filter names with frequency greater than 1
        List<String> duplicateNames = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        // this stream prints the whole object of student instead of printing only name
        List<Student> duplicateStudents = studentList.stream()
                .filter(student -> frequencyMap.get(student.getName()) > 1)
                .collect(Collectors.toList());

        System.out.println(duplicateNames);
    }
}


class Student {
    private String name;
    private int salary;
    private String location;

    public Student(String name, int salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }
}