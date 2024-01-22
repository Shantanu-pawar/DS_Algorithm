package I0I_Java8_Features;

/*
functional interface :
it's just an interface which has exactly one abstract method.
and if there are more than one abstract methods in interface, so then
it's not functional interface

why we used functional interface ?
we use it to enable lambda expressions. and lambda expression provides
concise way to represent method as an object.

how we define functional interface?
we just annotate it @FunctionalInterface - so that this annotation force
the interface to remain functional by allowing single abstract method.

and we can implement functional interfaces with the help of lambda
expressions
___________________________________________________________________
now below we'll see how we achieve functional interface with the help
of lambda expressions.

then what happens when we define more that on method in our interface?
if we do that, so we don't able to use lambda expression. cause lambda
is designed to used when it has only single abstract method.

Question : what are the default methods ?
The most important use of default methods is to provide additional function
to our interface.

*/


public class Functional_Interface {
    public static void main(String[] args) {

        Functional fun = (a,b) -> a + b;

        double ans = fun.add(1,32.2);
        System.out.println(ans);
    }
}

@FunctionalInterface
interface Functional{
    public double add(double a, double b);

    default void discord(){
        System.out.println("this is the impl of discord");
    }
}
