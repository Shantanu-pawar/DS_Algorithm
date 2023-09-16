package I9I_Recursion;

public class o10_remove_Target_Char_From_String {
    public static void main(String[] args) {
        String s = "b-cdefgh-bb";
        char target = 'b';

        drop (s, target, 0);
 		System.out.println(ans);
    }

    static String ans = "";
    static String drop (String s, char target, int i) {

        if(s.length() == i) return ans;
        char ch = s.charAt(i);

        if(ch != target) {
            ans += ch;
            return drop(s, target, i+1);
        }

        return drop(s, target, i+1);
    }
}
