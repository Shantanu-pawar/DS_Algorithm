package Questions_nd_CONCEPTS.Arrays_And_Strings_concepts;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RegexConcept {
    public static void main(String[] args) {

        String str = "this is java, and java@ is good! language";
        countAllWordsFrequency(str);
    }

    private static void countAllWordsFrequency(String str) {

        // concepts of replacements : suppose i wanna replace ', ! @ $' from string
        String s = str.replaceAll("[,!@]", "");

        String[] arr = s.split(" ");

        Map<String, Long> allWordsFreq = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println(s);
        System.out.println(allWordsFreq);
    }
}
