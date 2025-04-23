import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class prac {}

 class DistinctExampleUserDefined {


    public static void main(String[] args) {
        ArrayList<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(101, "MCA", "Ram"));
        listOfStudent.add(new Student(102, "MCA", "Sham"));
        listOfStudent.add(new Student(103, "MCA", "Krishna"));
        listOfStudent.add(new Student(104, "MCA", "Satyam"));
        listOfStudent.add(new Student(105, "MCA", "Joshi"));
        listOfStudent.add(new Student(105, "MCA", "Ram"));
        listOfStudent.add(new Student(103, "MCA", "Krishna"));

        listOfStudent.stream().distinct().forEach((student ->
        {
            System.out.println("Student RollNo:" + student.getRollNo());
            System.out.println("Student Name:" + student.getName());
            System.out.println("Student Class:" + student.getClassName());
        }));
    }
}

class Student {
    int rollNo;
    String className;
    String name;

    public Student(int rollNo, String className, String name) {
        this.rollNo = rollNo;
        this.className = className;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.rollNo == ((Student) obj).getRollNo();
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }
}