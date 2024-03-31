package Questions_nd_CONCEPTS.AccentureQuestions;

//Question 12 : replace char https://prepinsta.com/accenture/coding/

public class a14_OperationChoices {
    public static void main(String[] args) {

        int a = 16;
        int b = 20;
        int c = 1;
        int ans = solve(a, b, c);
        System.out.println(ans);
    }
    static int solve(int a, int b, int c){
        if(c == 1){
            return a+b;
        }
        else if(c == 2){
            return a-b;
        }
        else if(c == 3){
            return a*b;
        }
        else if(c == 4){
            return a/b;
        }

        else return 0;
    }
}
