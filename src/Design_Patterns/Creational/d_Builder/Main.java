package Design_Patterns.Creational.d_Builder;

class Student{
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private int rollNo;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Student build(){
        // this is how we return all params
        return new Student(name, rollNo);
    }

}
public class Main {
    public static void main(String[] args) {

        Student st = new StudentBuilder()
                .setName("raju")
                .setRollNo(121)
                .build();

        System.out.println(st);
    }
}
