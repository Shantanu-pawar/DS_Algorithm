package CoreJava_java8._4_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    static void oddList(List<Integer> l1){
        // find odd numbers in stream and return into arraylist
        List<Integer> oddList = l1.stream()
                .filter(x -> x%2 != 0)
                .collect(Collectors.toList());

        System.out.println(oddList);
        System.out.println("This is all odd Number's list");

        System.out.println("\n after sorting this list");
        List<Integer> sortedList = oddList.stream()
                                .sorted((a, b) -> b - a)
                                .collect(Collectors.toList());
        System.out.println(sortedList);
    }


    public static void main(String[] args) {
        List<Integer> l1 = List.of(23,56,78,9,75,6,4,21,3,45,454,5,41);

        // find Odd numbers list with the help of stream
        oddList(l1);

        // Ques : filter the number's who are greater than 71
        List<Integer> greaterThanList = l1.stream()
                .filter(i -> i > 71)
                .collect(Collectors.toList());
        System.out.println("\n Greater than the targeted numbers 71 : \n" + greaterThanList);
    }
}
