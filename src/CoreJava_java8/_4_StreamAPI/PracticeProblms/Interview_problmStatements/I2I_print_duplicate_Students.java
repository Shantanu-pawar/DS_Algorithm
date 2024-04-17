package CoreJava_java8._4_StreamAPI.PracticeProblms.Interview_problmStatements;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class I2I_print_duplicate_Students {
    public static void main(String[] args) {

        //statement : print duplicate student objects using stream API
        List<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student( 101, "Ram", 9.7));
        listOfStudent.add(new Student( 102, "Sham", 5.56));
        listOfStudent.add(new Student( 103, "Krishna", 8));
        listOfStudent.add(new Student( 104, "Anuradha", 5.57));


/* now sort according to name but let's see
Comparator.comparing(Student::getName) creates a comparator that compares students based on their names. */

        List<Student> result = listOfStudent.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        System.out.println(result);

        // now i'm sorting based on the students ranking
        List<Student> sortedBasedOnRank = listOfStudent.stream()
                .sorted(Comparator.comparing(Student::getRanking))
                .collect(Collectors.toList());

        System.out.println(sortedBasedOnRank);
    }
}

class Student {
    int rollNo;
    String name;
    double ranking;

    @Override
    public String toString() {
        return "rollNo: " + rollNo + " | name: " + name +
                ", with Ranking of: " + ranking + "\n";
    }

    public Student(int rollNo, String name, double ranking) {
        this.rollNo = rollNo;
        this.name = name;
        this.ranking = ranking;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }
}