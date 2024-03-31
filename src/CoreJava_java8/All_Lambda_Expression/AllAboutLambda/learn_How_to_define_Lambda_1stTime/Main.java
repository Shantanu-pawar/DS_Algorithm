package CoreJava_java8.All_Lambda_Expression.AllAboutLambda.learn_How_to_define_Lambda_1stTime;

public class Main {
    public static void main(String[] args) {

//      here we're defining variable for interface as anonomous class
        inter a = new inter() {
            @Override
            public void hello() {
                System.out.println("this is the class'es impl");
            }
        };
        a.hello();


/* USING LAMBDA USING FUNCTIONAL INTERFACE
* and in functional interface there is only one abstract method defined
*
* Now we're using our interface with the help of lambda - using functional interface
* */
        inter lambda = () -> {
            System.out.println("this is 1st time i'm using lambda");
        };
        lambda.hello();

    }
}