package Questions_nd_CONCEPTS.AccentureQuestions;

//Qiestion : 9 move all hyphens to string at front

public class a12_MoveHyphens {
    public static void main(String[] args) {
        String str = "Move-Hyphens- to-Front";

        System.out.println(check(str));
    }

    static String check(String str){
        if(str == null) return null;

        String hyphenStore = "";
        String chars = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '-') hyphenStore += ch;

            else chars += ch;
        }

        return hyphenStore + chars;
    }
}
