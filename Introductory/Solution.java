import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       Scanner sobj = new Scanner(System.in);
       
       int T = sobj.nextInt();
        sobj.nextLine();
       for( int i=0; i<T; i++)
       {
          
           String s = sobj.nextLine();
           char[] myCharArray = s.toCharArray();
           
           char str[] = new char[s.length()/2+1];
           char gtr[] = new char[s.length()/2+1];
           
           for(int j=0,k=0,l=0; j<s.length(); j++)
           {
               if( j%2 == 0)
               {
                   str[k++] = myCharArray[j];
               }
               else
               {
                   gtr[l++] = myCharArray[j];
               }
            } 
           System.out.print(str);
           System.out.print(" ");
           System.out.println(gtr);
       }
       
    }
}
