package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

public class Convert_Int_And_Strings {
    public static void main(String[] args) {
        Functions.compare_twoStrings();
    }
}

class Functions{
    static void int_To_String(){
        int n = 23245;
        String s = Integer.toString(n);
        System.out.println(s + " :: is the conversion of int-string");
    }

    static void String_To_int(){
        String str = "323435";
        int n = Integer.parseInt(str);
        System.out.println(n);
    }

    static void compare_twoStrings(){
    // in this we convert and check which string is greater
        String s = "11232";
        String ss = "234";
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(ss);

        if(a < b) System.out.println(b);
        else System.out.println(a);
    }
    // this is or method to convert integers to string
    static void convert(){
        int ab = 11111111;
        String ans = String.valueOf(ab);
        System.out.println(ans);

        // nwo it totally converted in string
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
    }
}