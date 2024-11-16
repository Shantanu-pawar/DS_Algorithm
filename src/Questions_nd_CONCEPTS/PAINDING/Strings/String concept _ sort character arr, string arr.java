import java.util.*;

public class Main{
	public static void main(String[] args) {
		  
		  // method for sorting the string : 
		  
		  String str = "zalkaua";
		  char [] arr = new char[str.length()];
		  
		  for(int i=0; i<str.length(); i++ ) {
		      arr[i] = str.charAt(i);
		  }
		  
		  Arrays.sort(arr);
		  System.out.println("now just print using new string : ");
		  System.out.print(new String(arr));

		  
		  
		  // method : for sorting the string Array
		  
		  
		  String a2 = "boy aunion catu";
		  String [] word = a2.split(" ");
		  
		  Arrays.sort(word);
		              System.out.println();		  
		  System.out.println(Arrays.toString(word));
	}
}
