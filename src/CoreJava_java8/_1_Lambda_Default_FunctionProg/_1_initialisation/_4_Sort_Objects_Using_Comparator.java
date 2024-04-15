package CoreJava_java8._1_Lambda_Default_FunctionProg._1_initialisation;

import java.util.ArrayList;
import java.util.Collections;

public class _4_Sort_Objects_Using_Comparator {
}

// created student object so that we can sort it in main class
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id + ": " + this.name;
    }
}

class objectSorting{
    public static void main(String[] args) {
        Student rahul = new Student(100, "rahul");
        Student shashi = new Student(1, "sashikant");
        Student dada = new Student(44, "dada");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(32, "sagar"));
        list.add(rahul);
        list.add(dada);
        list.add(shashi);

        System.out.println("before sorting : " + list);

        // here i've written custom comparator for descending sorting
        Collections.sort(list, (a, b) -> b.id - a.id);
        System.out.println("\n after sorting");
        System.out.println(list);
    }
}