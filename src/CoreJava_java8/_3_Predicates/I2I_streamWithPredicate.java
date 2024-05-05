package CoreJava_java8._3_Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class I2I_streamWithPredicate {}

class StreamWithPredicate{
    public static void main(String[] args) {
//        useSimplePredicate();
//        usePredicateWithLambda();
        usePredicateWithString();

    }

    // check all the string who starts with string ram and then print it
    private static void usePredicateWithString() {
        List<String> list = Arrays.asList("ramRaj", "discord", "ramji", "cors manage");

        Predicate<String> startsWith = x -> x.startsWith("ram");
        for(String str : list)
            if(startsWith.test(str))
                System.out.print(str + " ");

        System.out.println("\n \nchecking the words contains cors");
        // suppose we wanted to check if my list contains some words or not ?
        list.stream()
                .filter(x -> x.contains("rs"))
                .forEach(System.out::println);
    }


    // Question :we're simply checking like the numbers we've in lists are even or not?
    private static void useSimplePredicate() {
        Predicate<Integer> isEven = x -> x%2 == 0;
        List<Integer> number = Arrays.asList(1,2,3,13,47);
        for (int x: number) {
            Boolean check = isEven.test(x); // .test() means we're simply checking in the implementation part

            if(check) System.out.println(x);
        }
    }

    private static void usePredicateWithLambda() {
        List<Integer> list = Arrays.asList(3,4,2,100);

        // this is how we used predicate in stream API
        long ans = list.stream().filter(x -> x>4).count();
        System.out.println(ans);
    }
}