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
		
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int upper =0;
         int lower =0;
         
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
          
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
                
            
        }
        
        if(upper > lower) {
            System.out.println("capital String" + upper );
        }
        else{
            System.out.println("Small String" + lower);
        }
		
	}
}