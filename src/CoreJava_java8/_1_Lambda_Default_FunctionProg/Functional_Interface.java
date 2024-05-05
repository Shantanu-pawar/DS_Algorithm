package CoreJava_java8._1_Lambda_Default_FunctionProg;

/*
functional interface :
it's just an interface which has exactly one abstract method.
and if there are more than one abstract methods in interface, so then
it's not functional interface

why we used functional interface ?
we use it to enable lambda expressions. and lambda expression provides
concise way to represent method as an object.  */


public class Functional_Interface {
    public static void main(String[] args) {

        // ABSTRACT METHOD ACCESS
        Functional fun = (a,b) -> a+b;
        System.out.println(fun.add(1,32.2));

        // DEFAULT METHOD ACCESS
        fun.discord();

        // STATIC METHOD ACCESS = directly using
        //        [interfaceName.methodName]
        int ans = Functional.size(1, 42, 3);
        System.out.println(ans);
    }
}


@FunctionalInterface
interface Functional{
    public abstract double add(double a, double b);

    default void discord(){
        // this is the default methods.
        System.out.println("this is the impl of discord");
    }

    static int size(int a, int b, int c){
        return a+b+c;
    }
}
