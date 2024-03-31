package Questions_nd_CONCEPTS.I2I_starterQues;

public class o8_identifyPalindrome_Numbers_String {
    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(111));

        System.out.println(isPalindromeString("dadafd"));
    }

    static String isPalindromeString(String name){

        String newName = "";

        for(int i=name.length()-1; i>=0; i--) {
            char ch = name.charAt(i);
            newName  = newName + ch;
        }
        if(newName.equals(name))
            return "String is palindrome";

        else return "String is not palindrome";
    }

    static String isPalindromeNumber(int Number) {
        int no = Number;

        int rev = 0;
        int newNo = 0;

        while(no != 0) {
            rev = no % 10;
            newNo = (newNo * 10) + rev;
            no /= 10;
        }
        if(Number == newNo) return "Number is palindrome";
        else return "Number is not palindrome";
    }
}
