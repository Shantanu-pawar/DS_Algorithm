package I9I_Recursion;

public class o3_reverse_String_using_Recursion {
    public static void main(String[] args) {
        String str = "partians";
        System.out.println(reverse(str));
    }

    static String reverse(String str){
        if(str.length() == 0) return str;

// case : we're sending cutting each char's and then after length finished then we add back recursively.
        return reverse(str.substring(1)) + "" + str.charAt(0);
    }
}
