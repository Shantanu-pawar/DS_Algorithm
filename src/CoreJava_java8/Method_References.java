package CoreJava_java8;

/*
Method references :
____________________
method references is java 8 features which is compact,
and easy to read lambda expressions for the methods that already have name


where to use this ?
sometimes what happens, lambda expression are
doing nothing but just calling existing method

so in that case instead of using that it will
be clearer to called existing method by name.
so method references enables you to do this.


types - kinds of method references?
1. reference to static method
ex : containingClass :: staticMethodName

2. reference to an instance method of an obj
ex : containingObj :: instanceMethodName

3. reference to a constructor.
ex : ClassName :: new


*/

import java.util.function.BiFunction;

public class Method_References {

    // this is concat operations
    // biFunction represents two args here and then produce's it's function.
    public static <T> T concat(T one, T two, BiFunction<T, T, T> concatenate){
        return concatenate.apply(one, two);
    }

    // this is static method - [we'll use it to calling static method]
    public static String concatNames(String one, String two){
        return one + two;
    }

    // this is instance method  - [we'll use it for calling]
    public String concatNamesForInstance(String one, String two){
        return one + two;
    }


    public static void main(String[] args) {

        // i've created the obj for instance method reference so that we can use it
        Method_References method = new Method_References();


        // Method reference calling with static method
        System.out.println(concat(
                "Java ", "here", Method_References::concatNames
        ));

        // Method reference calling with instance method [for this we've to create one obj in line no 56]
        System.out.println(concat(
                "calling method ", "using instance method", method::concatNamesForInstance
        ));

        // Method reference calling using con Constructor
        // for that we've to create interface - then define constructor in class
        MethodInterface methodPrint  = MethodPrintMsg::new;
        methodPrint.printMsg("this is method reference by constructor");

    }
}


@FunctionalInterface
interface MethodInterface{
    MethodPrintMsg printMsg(String msg);
}

class MethodPrintMsg{
    public MethodPrintMsg(String msg){
        System.out.println("This is constructor of this class");
    }
}