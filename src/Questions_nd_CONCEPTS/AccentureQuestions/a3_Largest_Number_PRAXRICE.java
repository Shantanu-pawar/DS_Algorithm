package Questions_nd_CONCEPTS.AccentureQuestions;


    import java.util.*;

public class a3_Largest_Number_PRAXRICE {

    public static void main(String[] args) {
        String [] a = {"3" , "30", "4", "53", "9"};
        int n = a.length;
        largestNumber(a,n);

    }
    static void largestNumber(String [] a, int n){

        Arrays.sort(a, new Comparator<String> (){
            public int compare(String a, String b) {
                String ab = a+b;
                String ba = b+a;

                int val = ab.compareTo(ba);

                if(val >= 0) return -1;
                else return 1;
            }
        });

        for(int i=0; i<n ;i++) {
            System.out.print(a[i]);
        }

    }
}
