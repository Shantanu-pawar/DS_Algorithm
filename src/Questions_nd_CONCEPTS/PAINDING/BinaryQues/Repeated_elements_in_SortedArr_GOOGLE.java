/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    // Ques : count all repetative elements from sorted array forTarget Position
    
    
	public static void main(String[] args) {
			int [] arr = {1, 2, 4, 4, 4, 4, 5, 6};
		int target  = 4;
		
		int first = firstPosition(arr, target);
		int last = lastPosition (arr, target);
		
// 		here return first and lst position
		System.out.println(first);
		System.out.println(last);
// 		here -1 because we jsut want to reffer index, not position

        	int ans = (last-first) +1; // +1 cause index based position
		System.out.println("your count is : " + ans);
	
	}
	
	public static int firstPosition (int [] arr, int target){
	   // simple hint : first pos find karaychiy means end start kade sarkawa.
	   //and viceVersa for end 
	   
	    int index = -1; 
	    int start = 0;
	    int end = arr.length -1 ;
	    
	    while(start <= end) {
	        int mid = start + (end-start)/2;
	        
	        if(arr[mid] >= target ) {
	            end = mid - 1;
	        }
	        else start  = mid+1;
	        
	        if(arr[mid] == target) index = mid;
	    }
	    return index;
	}
	
	
	public static int lastPosition (int [] arr, int target) {
	    int index = -1;
	    int start =0 ;
	    int end = arr.length -1 ;
	    
	    while(start <= end) {
	        int mid  = start + (end-start)/ 2;
	        
	        if(arr[mid] <= target) {
	            start = mid+1;
	        }
	        else end = mid-1;
	        
	        if(arr[mid] == target) index = mid;
	    }   
	    return index;
	}
}
