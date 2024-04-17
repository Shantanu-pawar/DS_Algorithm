package Design_OOP_Concepts.Class_Objects;

public class ex2_Initialise_class_By_Refference {
}

class student3 {
    int id;
    String name;
}

class TestStudent2{
    public static void main(String args[]){
        //Creating objects
        student3 s1 = new student3();
        student3 s2 = new student3();

        //Initializing objects
        s1.id=101;
        s1.name="Sonoo";

        s2.id=102;
        s2.name="Amit";

        //Printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}