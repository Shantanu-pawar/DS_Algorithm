package CoreJava_java8._4_StreamAPI.PracticeProblms;

import java.util.*;
import java.util.stream.Collectors;

public class I2I_findDuplicate_Obj_______SOLVEtHIS {
    public static void main(String[] args) {

//        Question: write a program to return all the duplicate student objects by using stream API

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student(13, "shashwat", "lombok"),
                new Student(46, "ganesh", "pune-mumbai"),
                new Student(11, "shashwat", "chennai"),
                new Student(24, "mangesh", "surat"),
                new Student(31, "ganesh", "parola")
        ));


        // Count frequency of each name
        Map<String, Long> frequencyMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        // Filter names with frequency greater than 1
        List<String> duplicateNames1 = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        // this stream prints the whole object of student instead of printing only name
        List<Student> duplicateStudents = studentList.stream()
                .filter(student -> frequencyMap.get(student.getName()) > 1)
                .collect(Collectors.toList());


        System.out.println(duplicateStudents);
    }
}


class Student {
    int number;
    String name;
    String location;

    public Student(int number, String name, String location) {
        this.number = number;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }
}