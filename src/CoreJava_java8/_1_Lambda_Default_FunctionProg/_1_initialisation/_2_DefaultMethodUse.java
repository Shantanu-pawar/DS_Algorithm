package CoreJava_java8._1_Lambda_Default_FunctionProg._1_initialisation;

public class _2_DefaultMethodUse {}
/*
    WE are going to see how we can access default methods from interface in class
    ans : for that we've to create lambda exp of that interface and then call it that's the
    only way to call default method

    MORAL : so just for calling default method we've to create lambda exp
*/

class Main1 {
    public static void main(String[] args) {

        // i've just defined that abstract method here
        Add1 inter = (a, b) -> a + b;

        // now suppose we've to call to that hello then
        inter.hello();
    }
}

@FunctionalInterface
interface Add1{
    public abstract int add(int a, int b);
    default void hello(){
        System.out.println("Hello Guyz");
    }
}

