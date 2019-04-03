import java.util.Scanner;

/*Given an integer n, print the first 10 multiples
where n x i where 1<=i<=10 on a new line
where n x i is the result
Input: n
Constraints:2<=n<=20
Output Format: print 10 lines where 1<=i<=10
contains n x i*/
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class Solution5 {
   private static final Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
      //      int n = scanner.nextInt();
      //      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      //
      //      //      for(int i=1;i>=1 && i<=10;i++) {
      //      for(int i=1;i<11;i++) {
      //         System.out.println(n*i);
      //      }
      //      //scanner.close();
      //      System.out.println("Hello");
      runShit();
      System.out.println("Hello works");
   }
   public static void runShit() {
      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      //      for(int i=1;i>=1 && i<=10;i++) {
      for(int i=0;i<11;i++) {
         System.out.println(n +" x "+i+" = "+n*i+" ");
      }
      scanner.close();
      System.out.println("Hello");
   }
}
