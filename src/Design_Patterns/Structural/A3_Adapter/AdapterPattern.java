package Design_Patterns.Structural.A3_Adapter;

import java.util.ArrayList;
import java.util.List;

interface Student{
    String getName();
    String getEmail();
}


// so there's class who implements this student Interface
class CollageStudent implements Student{
    private String name;
    private String email;

    public CollageStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }
}

// now this class does not implementing the StudentInterface
class SchoolStudent {
    private String name;
    private String email;

    public SchoolStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getFirstName(){return name;}
    public String getEmailId(){return email;}

}

class StudentClient{

    public List<Student> getStudentsList(){
        // now if we try to initialise this client class
        List<Student> students = new ArrayList<>();

        CollageStudent clgStudent = new CollageStudent("aris", "arista@railwy.co");
        SchoolStudent sStudent = new SchoolStudent("ramdas", "ramdas@network.co");

        students.add(clgStudent);

        // so now schoolStudent is not type Student that's why we've to create adapter of it
        // to adapt this situation we gonna pass it to adapter
        students.add(new SchoolStudentAdapter(sStudent));

        return students;
    }
}

public class AdapterPattern {
    public static void main(String[] args) {

        StudentClient client = new StudentClient();
        List<Student> studentsList = client.getStudentsList();

        for(Student s : studentsList){
            System.out.println(s.getName() + " | " + s.getEmail());
        }
    }
}
