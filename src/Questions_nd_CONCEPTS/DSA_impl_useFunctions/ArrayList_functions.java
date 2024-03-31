package Questions_nd_CONCEPTS.DSA_impl_useFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_functions {
    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(
            List.of(2,3,4,5,6,7,8,9)
    );

    // this is also new method to print arraylist
    List<Integer> li = Arrays.asList(232,34,3);

        System.out.println(list);
        System.out.println(list.size() + " : is the size of this list");

        list.remove(0);
        list.add(212121);
        System.out.println(list);


        System.out.println(li);

        System.out.println("\n print specific elements from arraylist");
        for (int i = 3; i < 5; i++) {
        System.out.print(list.get(i) + " ");
    }
}
}