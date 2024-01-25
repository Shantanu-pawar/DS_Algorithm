import java.util.SplittableRandom;

public class practice {
    public static void main(String[] args) {

        String str = "heyDadu";

        int i = 3;
        String ans = str.substring(i) +  "  " + str.substring(0, i);
        System.out.println(ans);
    }
}
