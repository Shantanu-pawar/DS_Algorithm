import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


public class TEST {
    public static void main(String[] args) {

        String str = "aaabbcdeggebaxx"; //cdeeba
        int start = 0;
        String ans = "";
        int end = start+1, n = str.length();

        while(end < n){
            int count = 0;
            while(end < n && str.charAt(start) == str.charAt(end)){
                end++; count++;
            }

            if(count == 0) ans += str.charAt(start);

            start = end;
            end = start+1;
        }

        System.out.println(ans);
    }
}