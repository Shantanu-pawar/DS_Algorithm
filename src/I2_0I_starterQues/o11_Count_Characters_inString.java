package I2_0I_starterQues;

public class o11_Count_Characters_inString {
    public static void main(String[] args) {

        String s = "TOT 123!!!@@$tal har";
        int upper = 0;
        int lower = 0;
        int no = 0;
        int specialChar = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if( ch != ' ') i++;

            if(ch >= 'a' && ch <= 'z') lower++;
            else if(ch >= 'A' && ch <= 'Z') upper++;
            else if(ch >= '0' && ch <= '9') no++;
            else specialChar++;
        }

        System.out.println(lower + " lower chars ");
        System.out.println(upper + " : upper case chars");
        System.out.println(specialChar + " : special case chars");
        System.out.println(no + " : numbers  chars");

    }
}
