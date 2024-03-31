package OOPs_Concepts;

public class all_TypesOf_Constructor {
/*
Constructor overloading is a feature in object-oriented programming that allows a class
to have multiple constructors with different parameter lists. Each constructor in the class
can have a unique set of parameters, enabling the creation of objects in different ways.


With constructor overloading, you can define multiple constructors within a class, each with a different number
of parameters or different types of parameters. This provides flexibility when creating objects, as you can choose
the constructor that best suits your needs based on the arguments you provide.

 */
// Constructor Overloading.

    public class Person {
        private String name;
        private int age;
        private String address;

        // Constructor with three parameters
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        // Constructor with name and age parameters
        public Person(String name, int age) {
            this(name, age, ""); // Calls the three-parameter constructor by providing a default value for address
        }

        // Constructor with only the name parameter
        public Person(String name) {
            this(name, 0); // Calls the two-parameter constructor by providing default values for age and address
        }
    }
//    __________________________________________________________________________________________________________________________________
//    Here's an example of how to use the implements keyword to implement an interface in Java:

    // Interface definition
    interface Printable {
        void print();
    }

    // Class implementing the Printable interface
    class MyClass implements Printable {
        @Override
        public void print() {
            System.out.println("Printing...");
        }
    }
}

    /*
    __________________________________________________________________________________________________________________________________
    define all types of constructor in java OOPS

    Default Constructor:
    A default constructor is automatically provided by the Java compiler if no constructor is explicitly defined in a class.
    It has no parameters and initializes the object with default values.

    For example:

    public class MyClass {
        // Default constructor
        public MyClass() {
            // Initialization code
        }
    }

    Parameterized Constructor:
    A parameterized constructor accepts parameters to initialize the object with specific values.
    It allows you to set initial values for the object's properties during object creation.

    public class MyClass {
        private int value;

        // Parameterized constructor
        public MyClass(int value) {
            this.value = value;
        }
    }

    Copy Constructor: A copy constructor creates a new object by copying the values of another object of the same class.
    It is useful when you want to create a new object with the same values as an existing object. For example:

    public class MyClass {
        private int value;

        // Copy constructor
        public MyClass(MyClass other) {
            this.value = other.value;
        }
    }

    Constructor Chaining: Constructor chaining allows one constructor to call another constructor within the same class.
    It enables code reuse and reduces duplication of initialization logic. This can be achieved using the this() keyword.

    public class MyClass {
        private int value;

        // Parameterized constructor
        public MyClass(int value) {
            this.value = value;
        }

        // Constructor chaining using 'this()'
        public MyClass() {
            this(0); // Calls the parameterized constructor with a default value
        }
    }

    Private Constructor: A private constructor is used to prevent the instantiation of a class.
    It is typically used in utility classes where all methods are static, and object creation is not intended.

    public class UtilityClass {
        // Private constructor
        private UtilityClass() {
            // Prevents instantiation
        }

    }


}
     */
