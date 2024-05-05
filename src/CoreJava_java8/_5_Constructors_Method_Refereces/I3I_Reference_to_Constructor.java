package CoreJava_java8._5_Constructors_Method_Refereces;

public class I3I_Reference_to_Constructor {}

class Test3{
    public static void main(String[] args) {

        StudentPrintName student = Student :: new;
        student.printName("ram");
    }
}

interface StudentPrintName {
    Student printName(String name);
}

class Student{
    Student(String name) {
        // just printing after making constructor
        System.out.println(name);
    }
}