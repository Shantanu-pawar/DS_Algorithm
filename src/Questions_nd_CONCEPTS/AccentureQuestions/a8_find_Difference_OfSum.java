package Questions_nd_CONCEPTS.AccentureQuestions;

// https://prepinsta.com/accenture/coding/#:~:text=))%3B%0A%20%20%7D%0A%7D-,Question%205,-%3A
//ques : 5


import java.util.ArrayList;
import java.util.List;

public class a8_find_Difference_OfSum {
    public static void main(String[] args) {
        solve(4, 20);
    }
    static void solve(int n, int m){

        List<Integer> al = new ArrayList<>();
        int sum = 0;
        int notDivisible = 0;

        for (int i = 1; i <= m; i++) {

            // here only take num which is not divisible by n
            if(i % n == 0) {
                al.add(i); sum += i;
            }

            else if(i % n != 0) notDivisible += i;
        }

        System.out.println(notDivisible - sum);
        System.out.println(al);
    }
}
