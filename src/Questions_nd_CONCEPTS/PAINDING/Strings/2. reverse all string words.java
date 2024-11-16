import java.util.*;

class Main{
	public static void main(String[] args) {
		
        
        String input = "java is great";
        // output : great is java
        
        
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            
            if (i != 0) 
                reversedString.append(" ");   
        }
        System.out.println("output  : " + reversedString);

	}
}

