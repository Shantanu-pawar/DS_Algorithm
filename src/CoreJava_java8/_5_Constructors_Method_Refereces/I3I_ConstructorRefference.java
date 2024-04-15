package CoreJava_java8._5_Constructors_Method_Refereces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I3I_ConstructorRefference {}

class Test3{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("raj", "saloni", "hitesh", "swarna");

        // now here we're converting this list into student object via constructor reference
        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}

class Student{
    String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}