/*Given a string S of length N is indexed from 0 to (N-1)
print the even and odd characters as 2 spaced separated strings on a single line
Input int T,each line i, String S
Constraints 1<=T<=10, 2<=length of S<=10000
Output for each string S where 0<=j<=T-1
print S's even characters, space, then S's odd characters*/
import java.io.*;
import java.util.*;

public class Solution6 {
   private static final Scanner scanner = new Scanner(System.in);
   //T is the number of test cases
   public static int T=scanner.nextInt();
   public static void doStuff() {
      //get string input
      String myString = scanner.next();
      int strLength=myString.length();
      //insert string into char array
      char[] myCharArray = myString.toCharArray();
      //print char array on the same line
      if(strLength>=2 && strLength<=10000) {
         for(int i = 0; i < strLength; i++){
            // print even indexed character
            if(i%2==0) {
               System.out.print(myCharArray[i]); 
            }
         }
         System.out.print(" ");
         for(int i = 0; i < strLength; i++){
            // print odd indexed character
            if(i%2!=0) {
               System.out.print(myCharArray[i]); 
            }
         }
         System.out.println(); 
      }
   }
   public static void main(String[] args) {
      int T=Solution6.T;
      if(T>=1 && T<=10) {
         for(int i=0;i<T-1;i++) {
            doStuff();
         }
      }
      scanner.close();
   }
}

