package CoreJava_java8.All_Lambda_Expression.AllAboutStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(23,56,78,9,75,6,4,21,3,45,454,5,41);
        List<Integer> oddList = new ArrayList<>();

        for(Integer i : l1) {
            if(i % 2 == 1) oddList.add(i);
        }

        System.out.println(l1);
        System.out.println("\n This is all odd Number's list");
        System.out.println(oddList);

//__________________________________________________________________________________________________

//        now for filtering out data this is very old method
//        let's try out this with using of streamAPI

        Stream<Integer> stream = l1.stream();

        //Ques : filter out all the even numbers from our main list and copy it to our new list
        List<Integer> newList = stream.filter( a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println("\n all even numbers list");
        System.out.println(newList);


        // Ques : filter the number's who are greater that 71
        List<Integer> greaterThanList = l1.stream().filter(i -> i > 71).collect(Collectors.toList());
        System.out.println("\n Greater than the targeted numbers 71 : \n" + greaterThanList);
    }
}
