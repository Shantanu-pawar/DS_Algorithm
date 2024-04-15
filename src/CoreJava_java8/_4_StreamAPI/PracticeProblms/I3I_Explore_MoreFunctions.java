package CoreJava_java8._4_StreamAPI.PracticeProblms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class I3I_Explore_MoreFunctions {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,2,3,2,44,2,232);

        // now we firstly filter this list collect even numbs
        // sort them and return to new list
        Stream<Integer> a = list.stream()
                .filter(x -> x % 2 == 0)
                .distinct() // remove duplicate elements
                .sorted();
        a.forEach(x -> System.out.print(x + " "));

        // now suppose i wanted to create descending sorting
        System.out.println("\n i've shorted descending");
        Stream<Integer> b = list.stream()
                .sorted((x, y) -> y - x)
                .limit(3); // returns only 3 elements from starting
        b.forEach(x -> System.out.print(x + " "));

    }
}
