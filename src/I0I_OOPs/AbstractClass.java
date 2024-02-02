package I0I_OOPs;

// base class
public class AbstractClass {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}

abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo()
    {
        String name = "avinash";
        System.out.println(name);
    }
}