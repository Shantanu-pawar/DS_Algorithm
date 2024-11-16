
// Problm statement : 
// 1. lalit has string which only contains red, white, black colours [w,r,b]
// 2. he don't like white colour, so he want's to convert either in red or black
// 3. so we have some user input for changing white or black into red 
//     and another input for changing white or red into black 

// 4. findout which one costs less and then return that value;?

// input : 2 3 wwrbb
// expected output : 8


import java.util.*;
public class Main{
      public static void main (String[]args){
    
          Scanner in = new Scanner(System.in);
          int costRed = in.nextInt();
          int costBlack = in.nextInt();
          String str = in.nextLine();

          int allred = 0;
          int allblack = 0;
          
          for(int i=0; i<str.length(); i++) {                
                char ch = str.charAt(i);
                
                if(ch == 'w' || ch == 'b') allred++;
                
                if(ch == 'w' || ch == 'r') allblack++;
          }
          
          int countR = allred* costRed;
          int countB = allblack*costBlack;
          
          int val = Math.min(countR, countB);
          System.out.println(val);
          
      }
}
