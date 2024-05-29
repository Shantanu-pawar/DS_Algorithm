package Questions_nd_CONCEPTS.I10I_two_Pointers;

public class Remove_dups_in_Contiguous_Fashion {
    public static void main(String[] args) {

        String str = "aaabbcdeggebaxx";
        // remove continuous fashion duplicates

        int start = 0;
        int end = start + 1;
        String ans = "";

        int n = str.length();
        while (end < n) {
            int count = 0;
            while (end < n && str.charAt(start) == str.charAt(end)) {
                end++;
                count++;
            }
            if (count == 0)
                ans += str.charAt(start);

            // and if i wanted to remove the duplicates chars only then use this
            // if(count >= 0) ans += str.charAt(i);
            start = end;
            end = start + 1;
        }
        System.out.println(ans);
    }
}
