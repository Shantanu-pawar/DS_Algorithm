package CoreJava_java8._2_StaticMethod;

public class StaticMethod{
    public static void main(String[] args) {

        // there is only one way to access static methods by using interface.methodName
        Greeting.hello();

        // ACCESSING DEFAULT METHODS : 2 WAYS
        // 1ST : and for default methods access as usual we've to create a class and invoke that method.
        // but we've to implement interface with our main cls


        // 2ND : create lambda exp and then access it;
        Greeting greet = (a) -> a.length()-1;
        System.out.println(greet.getLength("checkThisLength")); // OP : 15

        // DEFAULT METHOD CALLING
        greet.bye();
    }
}

interface Greeting {
    int getLength(String str); //.abstract method

    // since static methods don't required public cause interface is public by default.
    public static void hello() {
        System.out.println("Hello");
    }

    default void bye(){
        System.out.println("this is bye from default method");
    }
}