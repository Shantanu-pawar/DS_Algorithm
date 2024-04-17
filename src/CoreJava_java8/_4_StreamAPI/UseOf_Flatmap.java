package CoreJava_java8._4_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UseOf_Flatmap {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(12, 21,32));
        list.add(Arrays.asList(212, 3241, 2100));

        List<Integer> result = list.stream()
                .flatMap(List::stream)// we're just flattening the list into one single List
                .collect(Collectors.toList());

        System.out.println(result);


        // find sum using reduce function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);

        System.out.println(sum);

    }
}
