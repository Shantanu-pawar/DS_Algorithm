// import java.util.*;
// import java.lang.*;
// import java.io.*;

// public class Main{
// 	public static void main (String[] args) throws java.lang.Exception{
// 	  Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//       String s = in.next();

//       int [] arr = new int[n];
//       for(int i = 0; i< n; i ++) 
// 		  arr[i]  = in.nextInt();
      
// // case 1 : just create char arr, and store char into it's index
// 		char temp[] = new char[26];
// 		for (int i = 0; i < arr.length; i++) {
			
// 			// ch arr च्या arr[i] index position la  = ch ठेवा 
// 			temp[arr[i]] = s.charAt(i);
// 		}
		
// 		System.out.println(new String(temp));
// 	}
// }



// Another approach very good using hashmap
// https://course.acciojob.com/idle?question=ac357ab6-b52a-4e37-ae2e-7afac866afb7

import java.util.*;

public class Main{
	public static void main(String[] args) {		
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      String str = in.next();

      int [] arr = new int[n];
      for(int i = 0; i< n; i ++) 
	      arr[i]  = in.nextInt();
    
    // step 1 :store char's and all in map 
        HashMap <Integer, Character> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            map.put(arr[i], ch);
        }

    // step 2 : sort the arr 
        Arrays.sort(arr);
        String ans  = "";
        
    // step 3 : get the char's according to indexes of arr
        for(int i=0; i<arr.length; i++) {
            ans += map.get(i);
        }
        
        System.out.println(ans);
	}
}
