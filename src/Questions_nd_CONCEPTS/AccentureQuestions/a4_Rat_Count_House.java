package Questions_nd_CONCEPTS.AccentureQuestions;

/*
Question 1: Rat Count House [you can refer question from below link]
https://prepinsta.com/accenture/coding/#:~:text=Question%201%3A%20Rat%20Count%20House

*/
public class a4_Rat_Count_House {

    static int solve(int []arr, int rat, int unit){
        int ans = 0;
        if (arr.length == 0) return  -1;

        int totalAmountFood = rat * unit;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            ans++;

            if(sum >= totalAmountFood)
                return ans; // this represent the house no which is starting from 1
        }
        return 0;
    }

    public static void main(String[] args) {
        int rat = 7;
        int unit = 2; // per rat 2 units
        int []arr = { 2, 8, 3, 5, 7, 4, 1, 2};

        System.out.println(solve(arr, rat, unit));
    }
}
