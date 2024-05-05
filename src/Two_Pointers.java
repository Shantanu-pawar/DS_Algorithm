public class Two_Pointers {
    public static void main(String[] args) {

        String str = "aaabbcdeggebaxx";
        // remove continuous fashion duplicates

        int i=0;
        int j=i+1;
        String ans = "";

        int n = str.length();
        while(j < n){
            int count = 0;
            while(j < n && str.charAt(i)==str.charAt(j)){
                j++; count++;
            }

            if(count == 0)
                ans += str.charAt(i);

            // and if i wanted to remove the duplicates chars only then use this
            // if(count >= 0) ans += str.charAt(i);

            i = j;
            j =i+1;
        }
        System.out.println(ans);

    }
}
