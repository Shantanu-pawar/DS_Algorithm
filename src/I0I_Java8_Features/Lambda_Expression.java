package I0I_Java8_Features;

/*
lambda expression is key feature of java 8

how does it help to developers ?
it allows to use the complete functionalities as a method arguments
and it allows devs to use code as Data.

so there are two types of implementations in lambda expressions.
1. without anonymous class
1. with anonymous class

*/

import java.util.Arrays;
import java.util.List;

public class Lambda_Expression {
    public static void main(String[] args) {

        // without anonymous class
        Function fun = (a, b) -> a + b;
        int ans = fun.add(233,4);
        System.out.println(ans);

//     _________________________________________________________

        // by using - anonymous class
        Welcome wel = new Welcome() {
            @Override
            public void subtract(int a, int b) {
                System.out.println(a-b);
            }
        };
        wel.subtract(23,4);
//     _________________________________________________________

        // use of lambda expression using arraylist iteration
        List<Integer> list = Arrays.asList(23,43,112,32,12);

        // now iterating here using forEach loop
        list.forEach(
            (a) -> System.out.println("integer : " + a.toString())
        );

    }
}

@FunctionalInterface
interface Welcome{
    public void subtract(int a,int b);
}

@FunctionalInterface
interface Function{
    public int add(int a, int b);
}