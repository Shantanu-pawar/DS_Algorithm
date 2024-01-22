import java.lang.reflect.Array;
import java.util.*;

public class practice {
    public static void main(String[] args) {

        String str = "reverse;";
        String ans= " ";

        char []arr = str.toCharArray();

        int i=0; int n = arr.length-1;
        while(i < n){
            char temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp; i++; n--;
        }
        System.out.println(new String(arr));
    }
}