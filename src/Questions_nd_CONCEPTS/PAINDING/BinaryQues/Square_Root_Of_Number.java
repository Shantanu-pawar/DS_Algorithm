import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{

                Scanner in = new Scanner (System.in);
                int n = in.nextInt();

                System.out.println(find(n));
                
        }
        static int find(int n) {
                long start = 0;
                long end = n;
                long ans = 1;

                while(start <= end) {
                        long mid = start + (end-start)/2;

                        if((mid*mid) > n) {
                                end = mid-1;
                        }

                        else if((mid*mid) < n) {

                                if((mid+1) * (mid+1) > n){
                                        ans = mid; break;
                                }
                                start = mid+1;
                        }

                        else {
                                 ans = mid; break;
                        }
                }
                return (int)ans;
        }
}


























                
// //Ques is preety strate you have to find the square root of number 
// // ex : 100 sqaure root is 10;
// //         81 is ans : 9
// // now what's the 91  swaure root ? 
// //so it's 9.234 but we only consider the number 
                
//                    Scanner in = new Scanner(System.in);
//                         int n = in.nextInt();
//                         System.out.println(findroot(n));
//         }
        
//         static int findroot(int n){
//                 long start = 0 , end = n;
//                 long ans = 1;

//                 while(start <= end) {
//                         long mid = start + (end-start)/2;

// //2 mins work :if you dry run this ques on pen and paper you'll automatically get it 
//                          if(mid*mid > n) end = mid-1;
                                 
//                         else if(mid*mid < n) {
                                
//                                 if((mid+1) * (mid+1) > n)  {
//                                         ans = mid; 
//                                         break;
//                                         }
                                
//                                   start = mid+1;
//                                 }
                         
//                         else { //(mid*mid == n)   & alwyas use brackets 
//                                 ans = mid;  break;
//                         }
//                 }
//                         return  (int)ans;
//         }
// }
