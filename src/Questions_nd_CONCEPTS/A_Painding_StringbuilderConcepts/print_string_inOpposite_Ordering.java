package Questions_nd_CONCEPTS.A_Painding_StringbuilderConcepts;

import java.util.StringTokenizer;

public class print_string_inOpposite_Ordering {
    public static void main(String[] args) {

        String name = "sunday is fun day and we love it/";
        String ans = " ";

        // step 1 : build string tokenizer object
        StringTokenizer st = new StringTokenizer(name);

        // step 2 : check if string has tokens or not
        while (st.hasMoreTokens()) {

            // step 3 : go to next tokens here and collect in new String ans;
            String st1 = st.nextToken();
            System.out.println(st1);
            ans = st1  + " " + ans;
            System.out.println(ans + "\n");
        }

        System.out.print(ans);
    }
}

