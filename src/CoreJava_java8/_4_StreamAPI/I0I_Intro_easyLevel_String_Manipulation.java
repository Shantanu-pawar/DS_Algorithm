package CoreJava_java8._4_StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class I0I_Intro_easyLevel_String_Manipulation {
    public static void main(String[] args) {
        String str = "this is java, and java@ is good! language";

//        countAllWordsFrequency(str);
//        countAllCharactersFromString(str);

//        sort the each words decresingly according to their length:
//        sortAccordingToLength(str);

        // reverse each word in string
        reverseTheWord(str);
    }

    private static void reverseTheWord(String str) {

        String[] arr = str.split(" ");

        String answer = Arrays.stream(arr)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(answer);
    }

    private static void sortAccordingToLength(String str) {
        String[] arr = str.split(" ");
        List<String> answer = Arrays.stream(arr)
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .collect(Collectors.toList());

        System.out.println(answer);
    }

    private static void countAllCharactersFromString(String str) {

        Map<Character, Long> ans = str.chars()

                // here i've used mapToObj changed
                .mapToObj(x -> (char) x)

                // these are the small changes like we've used Function.identity();
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));

        System.out.println(ans);
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
