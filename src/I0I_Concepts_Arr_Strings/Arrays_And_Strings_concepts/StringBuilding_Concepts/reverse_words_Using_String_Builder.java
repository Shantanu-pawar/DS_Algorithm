package I0I_Concepts_Arr_Strings.Arrays_And_Strings_concepts.StringBuilding_Concepts;

public class reverse_words_Using_String_Builder {
    public static void main(String[] args) {
        String str = "java is great"; // output : great is java
        reverseWords(str);

    }
    static void reverseWords(String input){
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);

            if (i != 0) reversedString.append(" ");
        }
        System.out.println("output  : " + reversedString);
    }

    static void reverseCharacters(String str){

    }
}