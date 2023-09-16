package I9I_Recursion;

import java.util.ArrayList;
import java.util.LinkedList;

/*Ques : is like store the indexes of the target elements from arr */
public class o9_store_indexes {
    public static void main(String[] args) {
        int []arr = {2, 4, 3, 5, 2, 2, 1};
        int target = 2; // ans : 0, 4, 5


//      method 1 : solve using list outside the parameters
        solve(arr, 0, target);
        System.out.println(list);

//      method 2 : solve using in the parameters
        ArrayList<Integer> ans = solveUsingArrList(arr, target, 0);
        System.out.println(ans);

//      method 3 : solve using passing our list as in parameters
        ArrayList<Integer> ans1 = solveByPassingList(arr, target, 0,  new ArrayList<>());
        System.out.println(ans1);
    }

    static ArrayList<Integer> solveByPassingList(int []arr, int target, int i, ArrayList<Integer> list2){
        if(i == arr.length) return list2;
        if(arr[i] == target) list2.add(i);

        return  solveByPassingList(arr, target, i+1, list2);
    }

    static ArrayList<Integer> solveUsingArrList(int []arr, int target, int i){
        ArrayList<Integer> ansList = new ArrayList<>();

        if(i == arr.length) return ansList;
        if(arr[i] == target) ansList.add(i);

        //case ? this object will collect all the data from each arraylist
        ArrayList<Integer> ansFromLowerCalls = solveUsingArrList(arr, target, i+1);
        ansList.addAll(ansFromLowerCalls);

        return ansList;
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void solve(int []arr, int i, int target){
        if(arr.length == i) return;

        if(arr[i] == target) list.add(i);
        solve(arr, i+1, target);
    }
}
