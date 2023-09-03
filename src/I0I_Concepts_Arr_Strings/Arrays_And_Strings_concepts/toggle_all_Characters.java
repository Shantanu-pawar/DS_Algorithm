package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;


// Question Logic : toggle char means convert the string into opposite form of char like
// change uppercase into lowercase char

public class toggle_all_Characters {
    public static void main(String[] args) {

        String st = "ADDq";
        String ans = "";

        for(int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);

            // just remember for upper case to lower case ch+32 cause
            // uppercase come first
            if(ch >= 'a' && ch <='z') ans += (char) (ch-32);

            else ans += (char) (ch+32);
        }

        System.out.print(ans);
    }
}

