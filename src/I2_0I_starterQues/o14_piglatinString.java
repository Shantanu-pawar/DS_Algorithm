package I2_0I_starterQues;

public class o14_piglatinString {

// piglatin quewstion concept :
// https://youtu.be/fz5i3SrDDg0?t=50
    public static void main(String[] args) {
        String str = "pigLatine";
        str = str.toUpperCase();

        int i;
        for( i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'A' ||ch == 'U' ||ch == 'O' ||ch == 'I' ||ch == 'E') // vowels
                break;
        }
        String ans = str.substring(i) + str.substring(0, i)+ "-AY";
        System.out.println(ans);
    }
}

