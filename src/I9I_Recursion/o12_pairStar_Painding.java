package I9I_Recursion;
import java.util.*;

//https://course.acciojob.com/idle?question=308cc4cd-d7e7-4df0-a378-6fcbf1cbca5f
public class o12_pairStar_Painding {
    public static String pairStar(String s) {

        if (s.length() <= 1) return s;

        if (s.charAt(0) == s.charAt(1))
            return s.charAt(0) + "*" + pairStar(s.substring(1));

        return s.charAt(0) + pairStar(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pairStar(s));
    }
}