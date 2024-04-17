package Design_OOP_Concepts.Class_Objects;

public class ex1_Student {}

// we can access field or data member by this
class Student{
    int id = 67;
    String name;

    public static void main(String [] args){
        student3 s1=new student3();//creating an object of Student
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);
    }
}

// we can also access the other classes field like below method

class Student1{
    double number = 32.231;
    String name = "raju";
}

class TestStudent1{
    public static void main(String args[]){
        Student1 s1=new Student1();
        System.out.println(s1.number);
        System.out.println(s1.name);
    }
}