package I2I_starterQues;

public class o5_reverseString {
    public static void main(String[] args) {

        String name = "dada";
        String ans = "";

        // another approach : we can directly convert it into char arr and then swap inplace.

        for(int i =name.length()-1; i>=0 ; i--) {
            char ch = name.charAt(i); // for specifying index in string
            ans += ch;
        }
        System.out.println(ans);
    }
}
