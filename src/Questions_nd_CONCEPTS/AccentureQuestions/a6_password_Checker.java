package Questions_nd_CONCEPTS.AccentureQuestions;

// question : password checker : https://prepinsta.com/accenture/coding/#:~:text=Question%203%3A%20Password%20Checker

/*if given string is valid password then return true else false

*/
public class a6_password_Checker {
    public static void main(String[] args) {
        String check = "aA1_67"; // true
        String check2 = "a987 abC012"; // false

        if(function(check)) System.out.println(true);
        else System.out.println(false);
    }

/* Condition :
– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number   */

    static boolean function(String str){

        char [] arr = str.toCharArray();
        if(arr.length < 4) return false;

        boolean startingDigit = true;
        boolean slash = true;

        int numericDigit = 0;
        int capChar = 0;
        for(char ch : arr){
            if(arr[0] >= '0' && arr[0] <= '9') startingDigit = false;

            if(ch >= '0' && ch <= '9') numericDigit++;

            if(ch >= 'A' && ch <= 'Z') capChar++;

            if(ch == ' ' || ch == '/') slash = false;
        }

        if(numericDigit >= 1 && capChar >= 1 && slash && startingDigit) return true;
        else return false;

    }
}

