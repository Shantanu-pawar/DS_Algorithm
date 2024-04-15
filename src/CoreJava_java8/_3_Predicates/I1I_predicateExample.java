package CoreJava_java8._3_Predicates;

import java.util.function.Predicate;
/*
    predicate is boolean valued functional interface.
    predicates are in generic type

    usage : if we wanted to check any value, or starting string then in that
    case we can use predicate interface with lambda exp.

    predicate sirf condition hold karke check karti hai bass like If-else
*/

public class I1I_predicateExample {
    public static void main(String[] args) {

        // check if salary is greater than 1 lack or not
        Predicate<Integer> salaryGreaterThanLack = salary -> salary > 100000;

        boolean check = salaryGreaterThanLack.test(121232);
        // that's how we check it returns true or false
        System.out.println(check);
    }
}
