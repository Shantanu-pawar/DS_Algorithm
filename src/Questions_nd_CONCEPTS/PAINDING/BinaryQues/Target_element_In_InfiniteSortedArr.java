package Questions_nd_CONCEPTS.PAINDING.BinaryQues;

import java.util.*;

// https://youtu.be/8x6dmO6XW8k?list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2
// reffer if you get stuck in this solution 

// find the target element's 1st occurance in infinite sorted arrr

/*
problm statement : 
find the target element's 1st occurrence in infinite sorted arrr  where there duplicate elements are present in arr

int [] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3 , 3, 3, 4, 5 , 6, 7, 8, 9, 9, 9, 9, 9};
target element : 3 [find first occurrence ]

*/

public class Target_element_In_InfiniteSortedArr{
  public static void main (String[]args){

    int [] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3 , 3, 3, 4, 5 , 6, 7, 8, 9, 9, 9, 9, 9};
        int target  = 2;
        
        // here we just find the start and end bound cause arr is infinite 
        int start = 0;
        int end = 1;
        
        while(target > arr[end]) {
            end = end*2;
        }
        
        System.out.println(firstOccurance(arr, target, start, end));
  }

    static int firstOccurance(int [] arr, int target, int start, int end){
        
        int ans = -1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(arr[mid] < target) start = mid+1;
            
            else if(arr[mid] >= target) {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}
