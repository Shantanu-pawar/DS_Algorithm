package Questions_nd_CONCEPTS.AccentureQuestions;

/*
https://prepinsta.com/accenture/coding/#:~:text=use%20Code%20CT70-,Question%202%3A%C2%A0,-(Asked%20in%20Accenture

*/
public class a5_binary_Number {
    public static void main(String[] args) {
        int ans = OperationsBinaryString("1C0C1C1A0B1"); //output 1
        System.out.println(ans);
    }
    
    //– A denotes AND operation
    //– B denotes OR operation
    //– C denotes XOR Operation
    static int OperationsBinaryString(String str) {
        if (str == null) return -1;
        int ans = str.charAt(0) - '0'; // taking 1st no to consideration

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                ans = ans & str.charAt(i + 1);
            }
            else if (ch == 'B') {
                ans = ans | str.charAt(i + 1);
            }
            else if (ch == 'C') {
                ans = ans ^ str.charAt(i + 1);
            }
        }

        return ans - '0';
    }
}
