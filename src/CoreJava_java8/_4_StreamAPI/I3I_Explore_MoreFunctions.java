package CoreJava_java8._4_StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class I3I_Explore_MoreFunctions {
    public static void main(String[] args) {

//        sortedArrUsingComparator();

        /* in this function we'll see how to generate and use some other functions */
//        generateNumbers();

//        findMaxNumberFromList();

        arraysKeSathKhelo();

//        streamKeSathKhelo();
    }

    private static void streamKeSathKhelo() {
        long answer = Stream.iterate(1, x -> x + 1)
                .limit(10)
                .peek(System.out::println)

                .filter(x -> x/2 == 0)
                .peek(System.out::println)
                .count();
        System.out.println("this is the answer : " + answer);
    }

    static void filterTheArray(){
        int []arr = {31, 13, 26, 7, 9};

        Arrays.stream(arr)
                .filter(x -> x > 7)
                .forEach(System.out::println);

        // suppose i wanted to collect all those elements into new array
        int [] ans = Arrays.stream(arr)
                .filter(x -> x>7)
                .toArray();
        System.out.println("\n \n collected elements from arr into another ans");
        System.out.print(Arrays.toString(ans));
    }


    private static void arraysKeSathKhelo() {
        int []arr = {23, 21,432,4};
        Integer sum = Arrays.stream(arr)
                .boxed()
                .max((a, b) -> a - b)
                .orElse(Integer.MIN_VALUE);

        System.out.println("this is the max element from arr : "+ sum);


        // suppose we've to sort the array using custom comparator'
        List<Integer> ans = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> b.compareTo(a)) // use for descending sorting
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void findMaxNumberFromList() {
        List<Integer> list = Arrays.asList(23, 45, 32, 3);
        Integer store = list.stream()
                .peek(System.out::println)
                .max((a, b) -> a-b)
                .get();

        System.out.println("Final answer : " + store);
    }

    private static void generateNumbers() {
        List<Integer> collect = Stream.iterate(1, x -> x+1)
                .limit(100) // want only 100 elements
                .skip(4) // skip first 4 elements
                .map(x -> x*10) // multiply each element by 10
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public static void sortedArrUsingComparator(){
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
