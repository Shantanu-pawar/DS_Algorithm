package CoreJava_java8.All_Lambda_Expression.AllAboutLambda._1_Creating_SUM_LAMBDA;

/*STEPS :"
* 1. we just created interface and define sum method in that
* 2. then we actually created lambda function using our interface and done!
*
*
* so there are two rules of lambda function
*   a. if there is one line defination then we can remove return and brackets
*   b. you don't have to state return type it automatically rectify it.
* */


public class main {
    public static void main(String[] args) {

        sumInterface add = (a, b) -> {
            return (a + b);
        };

        System.out.println(add.sum(12,31));

    }
}
