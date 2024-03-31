package Questions_nd_CONCEPTS.MathsQues;
/*
Ques : find in string if character 'a' index is in multiple of 3 or not
if yes then return Great if not then return worst
*/


public class find_a_repetation {
    public static void main(String[] args) {
        String s = "abcddea";
        boolean check = find(s);

        if(check) System.out.println("Good");
        else System.out.println("worst");
    }
    static boolean find(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' && i%3 != 0) // char find but index is not divisible by 0
                return false;
        }
        return true;
    }
}
