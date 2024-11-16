import java.util.*;

class Main{
	public static void main(String[] args) {
		
// ques : print first non repeated char from string if all char is repeated then print null
		
		String str = "aabbce";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
		    char c = str.charAt(i);
		    
		    if(map.containsKey(c)) map.put(c, map.get(c) + 1);
		    else map.put(c, 1);
		}
		
		for(Character a : map.keySet() ) {
		  //  just print all the elemnts from map
		  //  System.out.println(a + " " + map.get(a) );
		    
		  //  here print all non repetative elements 
		    if(map.get(a) == 1) 
		        System.out.println("yess element is present : " + a + " "+ map.get(a));
		}
		
// 		question : you can also print from arr by using same method
// 		int []arr= {2, 2, 3, 4, 5, 6, 6};
//         	// output : 3 4 5 
        
// 		HashMap<Integer, Integer> map  = new HashMap<>();

// 		for(int i=0; i<arr.length; i++) {
// 		    int a = arr[i];

// 		    if(map.containsKey(a )) map.put(a, map.get(a) + 1);
// 		    else map.put(a, 1);
// 		}

// 		for(int a : map.keySet()) {
// 		    if( map.get(a) == 1) 
// 		    System.out.print(a + " ");
// 		}
	}
}
//
//import java.util.*;
//public class Main{
//	public static void main(String[] args) {
//
//// 		arrr  = {2, 6, 4, 2};
//// 		output " 6 4 "
//
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//
//		for(int i = 0; i < n; i++)
//		    arr[i] = sc.nextInt();
//
//		int fre[] = new int[1000];
//		for(int i = 0; i < n; i++)
//		    fre[arr[i]]++;
//
//		for(int i = 0; i < n; i++)
//		    if(fre[arr[i]] == 1)
//		        System.out.print(arr[i] + " ");
//	}
//}
//
//
//
//
//
