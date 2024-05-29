package CoreJava_java8._4_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class I0I_Intro_easyLevelQues {
    public static void main(String[] args) {

        /* let's see the implementations of each method here */
        List<Integer> list = Arrays.asList(10, 10, 12, 22, 5, 100, 13, 55, 53, 22, 10, 1, 2);

//        filterMethod(list);
//        findAllEvenNumbersSum(list);
//        findAllNumbersStartingWith5(list);
//        findDuplicateElements(list);
//        findMaxMinValue(list);
//        sortTheList(list); // sorted using comparator

        removeDuplicateFromList(list);

        int []arr = {10, 10, 12, 22, 5, 100, 13, 55, 53, 22, 10, 1, 2};
//        checkArrContainsDuplicates(arr);

    }

    private static void checkArrContainsDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        List<Integer> ans = Arrays.stream(arr)
                .boxed()
                .filter(num -> !set.add(num))
                .collect(Collectors.toList());

        if(ans.size() > 0) System.out.println("contains duplicates");
        System.out.println(ans);
    }

    private static void removeDuplicateFromList(List<Integer> list) {
        List<Integer> withoutDups = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(withoutDups);
    }

    private static void sortTheList(List<Integer> list) {
        List<Integer> ans = list.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(ans);
    }

    private static void findMaxMinValue(List<Integer> list) {
        // here find max and min value from list
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);

        System.out.println(max.orElse(null));

    }

    private static void findDuplicateElements(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        list.stream()
                .filter(x -> !set.add(x)) // here set madhe add nai zala then print
                .forEach(System.out::println);

    }

    private static void findAllNumbersStartingWith5(List<Integer> list) {
        list.stream()
                .filter(num -> num.toString().startsWith("5"))
                .forEach(System.out::println);

    }

    private static void findAllEvenNumbersSum(List<Integer> list) {
        int sumOfEvenNumbers = list.stream()
                .filter(x -> x%2 == 0)
                .mapToInt(Integer :: intValue)
                .sum();

        // for working on arrays we've to use boxed(), instead of directly mapping
        System.out.println(sumOfEvenNumbers);
    }


    private static void filterMethod(List<Integer> list) {
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);

        // find the total numbers from list
        int[] arr = {1, 4, 6};
        long count = Arrays.stream(arr)
                .count();
        System.out.println(count);
    }
}
