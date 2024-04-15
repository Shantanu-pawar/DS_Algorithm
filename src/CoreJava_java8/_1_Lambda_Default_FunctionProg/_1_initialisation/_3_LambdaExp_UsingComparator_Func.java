package CoreJava_java8._1_Lambda_Default_FunctionProg._1_initialisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class _3_LambdaExp_UsingComparator_Func {}

class Check {
    public static void main(String[] args) {

        /*we can sort arraylist also using comparator operator*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(120);
        list.add(2);
        list.add(45);
        System.out.println("for acsending arraylist sorting");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\n for descending sorting");
        Collections.sort(list, (a,b) -> b-a);
        System.out.println(list);


        System.out.println("\n Before descending sorting");
        // by-default Treemap | Treeset sorts the key by their natural orders.
        Map<Integer, Character> m = new TreeMap<>();
        m.put(10,'a');
        m.put(4,'n');
        m.put(8,'f');
        m.put(98,'h');
        System.out.println(m);

        System.out.println("\n After descending sorting");
        /*using comparator function with lambda function
        we're defining the ascending & descending order of any keys */

        Map<Integer, Character> map = new TreeMap<>((a, b) -> b-a);
        map.put(98,'h');
        map.put(13,'e');
        map.put(16,'s');
        map.put(3,'z');
        map.put(2,'f');
        System.out.println(map);
    }
}
