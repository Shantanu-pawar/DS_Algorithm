package CoreJava_java8._4_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class I1I_sumOfEvenNo {
    public static void main(String[] args) {

        // write a program to find sum of even and odd numbers with the help of streams
        List <Integer> list = Arrays.asList(1, 2, 3, 4);

        int sumOfEvenNumbers = list.stream()
                .filter(x -> x%2 == 0)
                .mapToInt(Integer :: intValue)
                .sum();

        // for working on arrays we've to use boxed(), instead of directly mapping

        System.out.println(sumOfEvenNumbers);
    }
}