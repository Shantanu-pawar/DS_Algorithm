package CoreJava_java8._5_Constructors_Method_Refereces;

import java.util.Arrays;
import java.util.List;

public class I1I_MethodReference {}

/*

method references allows us to refer to a method without invoke it
        making our code cleaner and more readable.

they can be used in place of a lambda expression when the lambda
expression only calls an existing method. !

*/

class Test {

    public static void print(String str) {
        // here we're simply printing str
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> student = Arrays.asList("ravi-palesha", "sham-ssvps", "rakesh-palesha");

        // there are two ways to use method references
        // 1. with static methods
        // 2. without static methods

        // using lambda expressions
        student.forEach(x -> System.out.println(x));

        // so here in this context we can replace this with method references
        System.out.println("\n now we'll print with help of method references");
        student.forEach(Test::print);
    }
}