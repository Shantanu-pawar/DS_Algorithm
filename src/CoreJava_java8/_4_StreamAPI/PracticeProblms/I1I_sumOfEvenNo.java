package CoreJava_java8._4_StreamAPI.PracticeProblms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class I1I_sumOfEvenNo {
    public static void main(String[] args) {

        // write a program to find sum of even and odd numbers with the help of streams
        List <Integer> list = Arrays.asList(1, 2, 3, 4);

        int evenSum = list.stream()
                .filter(x -> x%2==0)
                .mapToInt(Integer::intValue)
                .sum();


        // let's try to find oddSum using different way
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        int oddSum = 0;
        for(int x : collect)  oddSum += x;

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}