package Questions_nd_CONCEPTS.I4I_AccioQues;

public class find_if_String_Is_Valid {
    /*
    * Ques valid string :
    * we've to remove only one character to make string valid
    * if we've to removed two char's then it's not valid
Examples :
Input : string str = "abbca"
Output : Yes
We can make it valid by removing "c"

Input : string str = "aabbcd"
Output : No
We need to remove at least two characters
to make it valid.

Input : string str = "abbccd"
Output : No
We are allowed to traverse string only once.

*/
    public static void main(String[] args) {
        String str = "abbca";

        if (isValidString(str)) System.out.println("YES");
         else System.out.println("NO");
        }

    static boolean isValidString(String str){

        int []freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1 || freq[i] > 2) count++;
        }

        if(count > 1) return false;
        else return  true;
    }
}
