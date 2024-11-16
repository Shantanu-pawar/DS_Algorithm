import java.util.*;

class Main {
    public static void main(String[] args) {
        
        // concept : convert string number's into character number's.
     
            String st = "121233";
            
            int []arr = new int[st.length()];
            for(int i=0; i<st.length(); i++) {
                
                char ch = st.charAt(i);
                arr[i] = ch-'0';
            }
            for(int x : arr) System.out.print(x + " ");
    }
}

