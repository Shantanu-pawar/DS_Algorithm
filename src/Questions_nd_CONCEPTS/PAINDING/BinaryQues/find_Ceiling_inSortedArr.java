// ex : arr : [1 4 8 9 10]     target :5
// here in this problm we have to find smallest elemt from arr that is greater than the 5 [means 1st next element from arr]

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int n = in.nextInt(); // arr
            int target = in.nextInt(); // target
            int []arr = new int[n];
            
            for(int i=0; i<arr.length;i++){
                arr[i] = in.nextInt();
            }
            
            System.out.println(BS(arr, target));
        
    }
    
    static int BS(int []arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        
        while(start <= end) {
            int mid = start +(end-start)/2;
            
//          2 3 7 8 9  target : 5  return index;
            
            if(target < arr[mid]) {
                result = mid;
                end=  mid-1;
            }
            else if(target > arr[mid]) start = mid+1;
            
            else if(target == arr[mid]) return mid;
            
        }
        return result;
    }
}


