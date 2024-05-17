package Questions_nd_CONCEPTS.I2I_starterQues;

import java.util.ArrayList;

public class o12_Armstrong_Number {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 100; i < 1000; i++) {
            int no = i;
            int digit = String.valueOf(no).length();

            int temp = i;
            int ans = 0;

            while (no > 0) {
                int last = no % 10;
                ans += Math.pow(last, digit);
                no /= 10;
            }

            if (temp == ans)
                list.add(temp);
        }

        System.out.println(list);
    }
}


