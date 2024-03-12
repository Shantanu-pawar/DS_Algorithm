package I0I_OOPs.Design_Patterns.Creational.factory;

//resource : https://www.youtube.com/watch?v=YIB3u0KYrUI
public class FactoryPattern {
    public static void main(String[] args) {

        Salary emp = EmployeeFactory.getSalary("java dev");
        System.out.println(emp.salary());
    }
}

// condition : we're setting the salaries based on developers profile
interface Salary{
    int salary();
}

class JavaDeveloper implements Salary{
    @Override
    public int salary(){
        System.out.println("java developer salary : ");
        return 500300;
    }
}

class WebDeveloper implements Salary{
    @Override
    public int salary(){
        System.out.println("web developer salary : ");
        return 200100;
    }
}

/*
this class has all the responsibility to manage the other classes.
so this class can actually accepts the parameters as input  */
class EmployeeFactory{
    public static Salary getSalary(String jobType) throws NullPointerException{

        if(jobType.trim().equalsIgnoreCase("Java developer")) {
            return new JavaDeveloper();
        }

        else if(jobType.trim().equalsIgnoreCase("web developer")) {
            return new WebDeveloper();
        }

        else throw new NullPointerException("Enter correct job type details");
    }
}