package I2I_starterQues;

public class o5_reverseString {
    public static void main(String[] args) {
//        usingReverseLoop("dada");
//        anotherApproach("reverse;");
        usingStringBuilder("reverse");
    }

    static void usingStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        // this is required to convert stringBuilder to string so that we perform action on string
        String ans = sb.toString();
        System.out.println(ans += " heyy");

    }

    static void usingReverseLoop(String name){

        String ans = "";
        // another approach : we can directly convert it into char arr and then swap inplace.
        for(int i =name.length()-1; i>=0 ; i--) {
            char ch = name.charAt(i);
            // for specifying index in string
            ans += ch;
        }
        System.out.println(ans);
    }

    static void anotherApproach(String str){
        String ans = " ";
        char [] arr = str.toCharArray();

        int i=0; int n = arr.length-1;
        while(i < n){
            char temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp; i++; n--;
        }
        System.out.println(new String(arr));
    }
}
