import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class practice {
    public static void main(String[] args) {

      int n = 3;
      int m = 20;
      int divisiblesum = 0;
      int notdivisible = 0;
        for (int i = 0; i <= 10; i++) {
            if(i%n ==0) divisiblesum+= i;
            else notdivisible+= i;
        }

        System.out.println(Math.abs(divisiblesum - notdivisible));

    }
}