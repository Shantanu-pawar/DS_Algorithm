package CoreJava_java8._3_Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class I3I_default_staticMethods_inPredicates {}

class defaultStaticMethodsInPredicate{
    public static void main(String[] args) {

        // now we're studying default methods in predicates
        stringContains_D_letter_ButExclude_dog_subString();
    }

    // Question : i want all the string who do not contain dog in the string but String starts with D.
    private static void stringContains_D_letter_ButExclude_dog_subString() {
        List<String> list = Arrays.asList("D_doggo", "Dinesh", "DjKhalid"); // expecting dinesh as output
        Predicate<String> check = x -> x.contains("dog");
        Predicate<String> startsWithD = x -> x.startsWith("D");


        // now using and | or default methods in this predicates we gonna solve this question
        for(String str : list) {

            // so here if we wanted to just check startWith D or containsDog then we use OR
            Predicate<String> result = check.and(startsWithD);

            if(!result.test(str))
                System.out.println(str);
        }
    }
}
