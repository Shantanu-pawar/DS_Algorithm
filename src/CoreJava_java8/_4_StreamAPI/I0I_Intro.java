package CoreJava_java8._4_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class I0I_Intro {
    public static void main(String[] args) {

        // here we've defined how to convert collections into streams.

        // declarative approach of streams
        int[] arr = {4, 2, 1, 3, 5};
        IntStream integerStream = Arrays.stream(arr);

        List<String> list = Arrays.asList("a", "b", "c", "d");
        Stream<String> stream = list.stream();

        String[] array = {"raj", "dash", "coreJava"};
        Stream<String> stringArray = Arrays.stream(array);

    }
}
