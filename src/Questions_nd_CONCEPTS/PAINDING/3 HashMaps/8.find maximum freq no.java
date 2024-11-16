import java.util.*;
class Main{
    public static void main(String []args) {
        // int n = in.nextInt();
        int []arr = {1, 13, 2, 12, 2 , 11, -12 , 2, -1, 2, 2, 11, 12, -6, 2};
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
        if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
        else map.put(arr[i], +1);
        }
        
        System.out.println(map);
        int freq = 0, no =0;
        for(int x : map.keySet()){
            // System.out.println(map.get(x)+ " "+ x);
          
          // for see freqency we use map.get(x)
            if(freq < map.get(x)) {
                freq = map.get(x);
                no = x;
            }
        }
      
        System.out.println("so the freq is : " + freq + " And no is : " + no);
    }
}
