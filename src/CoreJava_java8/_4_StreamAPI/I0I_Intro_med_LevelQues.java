package CoreJava_java8._4_StreamAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class I0I_Intro_med_LevelQues {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Dev","Byte","School","Dev","Byte");

//        convertWordsIntoUpperCase(words);
//        concatTwoStreams();
//        printLocalDate();
//        determineNumberOfOccurrences();

        printDistinctNamesOnly();

    }

    private static void printDistinctNamesOnly() {
        List<String> name = new ArrayList<>(Arrays.asList("alex", "beiheza", "Jeff", "ALEX", "Jeff"));

        List<String> result = name.stream()
                .map(String :: toLowerCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }


    private static void determineNumberOfOccurrences() {
        int[] values = {10, 1, 20, 2, 100, 100, 100};

        long count = Arrays.stream(values)
                .filter(x -> x == 100)
                .count();

        System.out.println(count);
    }

    private static void printLocalDate() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
    }

    private static void concatTwoStreams() {
        Stream<Integer> s1 = Stream.of(1,2,1);
        Stream<Integer> s2 = Stream.of(1321,214,45);

        List<Integer> ans = Stream.concat(s1, s2)
                .collect(Collectors.toList());
        System.out.println(ans);
    }

    private static void convertWordsIntoUpperCase(List<String> words) {
        List<String> ans = words.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
