package I2I_starterQues;

public class o11_Count_Characters_inString {
    public static void main(String[] args) {

        String name = "TOto 123!!!";

        int count = 0;
        int upper = 0;
        int lower = 0;
        int specialChar = 0;
        int digit = 0;

        for(int i=0; i< name.length(); i++) {

            char ch = name.charAt(i);

            if(name.charAt(i) != ' ') {
                if(ch >= 'A' && ch <= 'Z') upper++;
                else if(ch >= 'a' && ch <= 'z') lower++;
                else if(ch >= 48 && ch <= 57) digit++;

                else specialChar++;
            }
        }

        System.out.println(upper);
        System.out.println(lower); System.out.println(specialChar); System.out.println(digit);
    }
}
