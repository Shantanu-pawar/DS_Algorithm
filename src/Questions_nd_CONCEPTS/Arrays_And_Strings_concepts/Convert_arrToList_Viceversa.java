package Questions_nd_CONCEPTS.Arrays_And_Strings_concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_arrToList_Viceversa {
    public static void main(String[] args) {

        // we're simply converting from arr to list
        // convert with the help of stream API

        int []arr = {1, 2, 3, 4, 6};
        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(collect);


        List<Integer> list = List.of(23, 213, 31);
        int [] arr1 = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(arr1));
    }
}
