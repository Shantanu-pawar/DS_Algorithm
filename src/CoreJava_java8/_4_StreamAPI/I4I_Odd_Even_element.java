package CoreJava_java8._4_StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class I4I_Odd_Even_element {
    static void odd_Even_List_Sorting(List<Integer> list){
        // find odd numbers in stream and return into arraylist
        List<Integer> oddList = list.stream()
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
        List<Integer> list = List.of(23,56,78,9,75,6,4,21,3,45,454,5,41);
        odd_Even_List_Sorting(list);


        // Ques : filter the number's who are greater than 71
        List<Integer> greaterThanList = list.stream()
                .filter(i -> i > 71)
                .collect(Collectors.toList());
        System.out.println("\n Greater than the targeted numbers 71 : \n" + greaterThanList);
    }
}
