package I0I_Concepts_Must_Know;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_functions {

    public static void main(String[] args) {

        List <Integer> df  = List.of(2 ,3 ,4 ,5 ,6 , 7, 8); // use List.of to add multiple element's

        List<Integer> al = new ArrayList<>();
        al.add(2230);
        al.add(2);
        al.add(23);
        al.add(22);
        al.add(213);
        System.out.println(al);


        al.remove(0);
        System.out.println(al);
    }
}
