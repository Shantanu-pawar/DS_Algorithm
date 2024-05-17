package _Concepts_And_PsuedoCodes;

/* CHAINING OF CONSTRUCTOR

instead of creating new object for calling another constructor
we can use constructor chaining concept ::
so it's the process of calling one constructor to another by refering
the constructor using this() keyword.

QUETION: why do we need constructor chaining?
when we wanted to perform multiple tasks in single constructor and wanted to
make our program more readable then.

so there are two ways to call constructors:
___________________________________________
1. using this() - for calling the current class
2. using super() - for calling base class constructor


* */
class Test{
    Test(){
        this(101);
        System.out.println("This is default constructor");
    }
    Test(int a){
        System.out.println(a);
    }

    Test(String str, int rollNo){
        System.out.println(str + " :is the name, " +""+ rollNo + " :is the rollNO");
    }
}

// calling constructor from base class | using super
class Student extends Test{
    Student() {
        super("rahul", 12);
        System.out.println("calling constructor from BASE class: ");
    }
}
public class Constructor_Chaining {
    public static void main(String[] args) {
        new Test();
        new Student();
    }
}
