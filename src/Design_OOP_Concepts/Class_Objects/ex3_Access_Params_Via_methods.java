package Design_OOP_Concepts.Class_Objects;

public class ex3_Access_Params_Via_methods {}

class Student2{
    String name;
    int id;

    void saveStudent(int id, String name){
        this.id = id;
        this.name = name;
    }

    void printStudent(){
        System.out.println("id: " + id + " name: " + name);
    }
}

class Main{
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.printStudent();

        s.saveStudent(12,"raju");
        s.printStudent();
    }
}
