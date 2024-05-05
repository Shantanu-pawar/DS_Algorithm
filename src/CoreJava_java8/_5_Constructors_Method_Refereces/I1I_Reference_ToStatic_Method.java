package CoreJava_java8._5_Constructors_Method_Refereces;

import java.util.Arrays;
import java.util.List;

public class I1I_Reference_ToStatic_Method {}

/*
method references allows us to refer to a method without invoke it
        making our code cleaner and more readable.

they can be used in place of a lambda expression when the lambda
expression only calls an existing method. !


there are three ways to use method references
 1. reference to static methods
 2. reference to instance of method
 3. reference to Constructor

*/

interface Sayable{
    void say();
}

class Say{
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
}

class Reference_To_Static {
    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = Say :: saySomething;
        // Calling interface method
        sayable.say();
    }
}