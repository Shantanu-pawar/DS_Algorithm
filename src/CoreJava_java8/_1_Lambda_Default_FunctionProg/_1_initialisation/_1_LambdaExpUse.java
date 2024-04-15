package CoreJava_java8._1_Lambda_Default_FunctionProg._1_initialisation;

public class _1_LambdaExpUse {
}

/*
    how to initialise the lambda ?
    it's a anonymous function so we've to remove the returnType, methodName,
    and accessModifiers
*/


class Main {
    public static void main(String[] args) {

        // here we've to define our interface first and then only we can able to use functional interface'
        Add addition = (a, b) -> a + b;

        double ans = addition.add(12.23,3.071); // accessing via that interfaces variable.
        System.out.println(ans);
    }
}

// we annotate here just for the sake of compilations that compiler should know
@FunctionalInterface
interface Add{
    // here abstract method don't have body in interfaces | and should be 1 abstractMethod
    double add(double a, double b);

    // this is how we can define multiple default or static methods
    default void hello(){
        System.out.println("Hello");
    }
}

