package CoreJava_java8._4_StreamAPI.Interview_problmStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I3I_Use_Of_Distinct {}

class Main1{
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("alex", "beiheza", "Jeff", "ALEX", "Jeff"));

        List<String> result = name.stream()
                .map(String :: toLowerCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}



