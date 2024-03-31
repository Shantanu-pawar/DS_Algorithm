package Questions_nd_CONCEPTS.AccentureQuestions;

// question : 8 https://prepinsta.com/accenture/coding/#:~:text=))%3B%0A%7D%0A%7D-,Question%3A8,-(Asked%20in%20Accenture

import java.util.ArrayList;
import java.util.List;

public class a11_N_Based_Notation {
    public static void main(String[] args) {

        List<Character> li = new ArrayList<>();
        char chInt = '0'; char ch = 'A';

        for (int i = 0; i <= 35; i++) {
            if(chInt-'0' <= 9){
                li.add(chInt); chInt++;
            }
            else {
                li.add(ch); ch++;
            }
        }
        System.out.println(li);

        int n = 21;
        int num = 5678;

        String ans = "";
        int quotient = num;
        int rem = 0;
        while(quotient != 0){

            rem = quotient % n;
            quotient = quotient / n; // i'll put my reminder each time to my number.

            ans += li.get(rem); // i'll save the reminders value to string
        }

        //case : here just reverse the string
        if(quotient == 0){
            StringBuilder sb = new StringBuilder(ans);
            sb.reverse();
            System.out.println(sb.toString());
        }
        else System.out.println("null");
    }

}
