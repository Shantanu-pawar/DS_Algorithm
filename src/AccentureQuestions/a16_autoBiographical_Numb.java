package AccentureQuestions;

import javax.swing.event.CellEditorListener;
import java.util.HashMap;

public class a16_autoBiographical_Numb {
    public static void main(String[] args) {
        System.out.println(check("1210"));

        // note : if the no is autobiographical then return the sum or return 0
    }
    static int check(String str){

        int []arr = new int[str.length()];
        for (int i = 0; i < ; i++) {
            
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i)-'0';

            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }
            else map.put(ch, 1);
        }

        // now i'm just checking it's freq
        boolean check = true;
        int index = 0;
        int j = 1; int element = 0;
        for (int x : map.keySet()){
            if(index < str.length()){

            }
            System.out.println(x + "  " + map.get(x));
        }

        return 0;
    }
}
