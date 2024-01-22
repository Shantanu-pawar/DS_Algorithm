package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts;

public class String_all_methods {
    public static void main(String[] args) {
    trim();
    }

    static void upperLowerCase(){
        //  this is the type used for converting the Characters  in capital or small
        //  to Upper case() | to lower case()

        String s1= "FreeDDy";
        String a1 = s1.toUpperCase();
        String a2 = s1.toLowerCase();

        System.out.println(a1 + ": is the upper cases" + "\n" + a2 + "all lower case");
    }

    static void getCharacter(){
//        3. charAt() = this will return the specific number of char.
        String s = "dsaForLife";
        char b1 = s.charAt(3);
        System.out.println(b1 + ": is the character in string ");
    }

    static void substring(){
        // substring() = it returns part of the String

        String c = "Programming of mind";
        String c1 = c.substring(2,15); // this returns the substrings from string
        System.out.println(c1);
    }

    static void replace(){

        String str  = "acciojob";
        String ans = str.replace("cc", "O");
        System.out.println(ans);
    }

    static void concat(){
        //  6. concat () : it basically just combines the two strings in one String

        String e = " rada hua naa";
        String e1 = "ss ke pass huaa";

        String e2 = e1.concat(e);
        System.out.println(e2);
    }

    static void index(){

//  indexOf() | or lastIndexOf();
//  it returns the index value of given char(s).

        String f = "governments";
        int f1 = f.indexOf('n');
        int f2 = f.lastIndexOf('n'); // this shows last index
        int f3 = f.indexOf("ments");

        System.out.println( " this shows only first index : " + f1);
        System.out.println("This shows the last index only : "+ f2);
        System.out.println("this shows only word starting index : " + f3);
    }

    static void equals(){
        //   equals() \ equalsIgnoreCase() : it compress two String and returns boolean value

        String g = "Apple";
        String g1 = "apple";

        boolean g2 = g.equals(g1);
        boolean g3 = g.equalsIgnoreCase(g1);

        System.out.println("this checks the both strings exact equal or not and return " +
                "true or false : " + g2 );

        System.out.println("this just ignore the cases only and check both strings : " + g3);
    }

    static void compareTo(){
//  compareTo() | compareToIgnoreCase();
//  it compares two string and returns ascii difference of them
        String k = "apple";
        String k1 = "run";
        int k2 = k.compareTo(k1);
        int k3 = k.compareToIgnoreCase(k1);

        System.out.println("this checks the cases and return askii value diffrenece :" + k2);
        System.out.println(k3);
    }

    static void trim(){
    //  trim(); -> it removes all black space before string starts
        String l = "             bhauuu raja   ";
        String l2 = l.trim();
        System.out.println(l2);

    //  11. starts with | ends with

        String xx = "program";
        boolean aa = xx.startsWith("gram");
        boolean bb = xx.endsWith("gram");

        System.out.println("\n this is the String : " + xx);
        System.out.println("does GRAM contains at start of string? : " + aa);
        System.out.println("does GRAM contains at end of the string? : " + bb);
    }
}
