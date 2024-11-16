import java.util.*;
public class Main{
	public static void main(String[] args) {
	    
        int []arr = {1 , 2, 13, 4, 2, 2, 13, 13, 13};
        
        // hashmap approach
        HashMap <Integer, Integer> map = new HashMap<>();
    
        for(int i=0; i<arr.length; i++) {
             int c = arr[i];   
             if(map.containsKey(c)) map.put(c, map.get(c) + 1);
             
             else map.put(c, 1);
        }
        
        int max = 0; 
        int frequency = 0;
        for(int a : map.keySet()) {
            if(map.get(a) > max) {
                max = a;
                frequency = map.get(a);
            }
        }
        System.out.println(max + " is max element. and the frequency is : " + frequency);    
    
    
        
    //      Neive approach
    
    //     int maxCount = 0;
    //     int maxNo = 0;
        
    //     for(int i=0; i<arr.length; i++) {
    //         int count = 0;
                
    //         // case1: just traverse from each element and check
    //         for(int j=0; j<arr.length; j++) {
    //             if(arr[i] == arr[j]) count++;
    //         }
            
    //         //case2 : just store the max element here.
    //         if(count > maxCount) {
    //             maxCount = count;
    //             maxNo = arr[i];
    //         }
    //     }
        
    // System.out.print(maxNo);
    
	}
}



