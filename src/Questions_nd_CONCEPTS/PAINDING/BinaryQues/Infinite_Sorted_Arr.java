/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6,7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 26, 272, 321, 3245};
        int target  = 5;   
        
        int start = 0;
        int end = 1;
        
        // from this way we just trap the target element from which we wanna search 
        while(target > arr[end]) {
            start = end;
            end = 2 * end;
        }
        
        // now apply regular Binary serach
        System.out.println(BS(arr, target, start, end));
	}
	static int BS(int []arr, int target, int start, int end) {
	    
	    
	         while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

