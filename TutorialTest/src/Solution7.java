//Given an array A of integers N, print A's elements in reverse order
//as a single line of space-separated numbers
//Input
//   the first line is an integer N (size of array)
//   the second line contains N space-separated integers,array A's elements
//Constraints
//   1 <= N <= 1000
//   1 <= A(i) <= 10000 where A(i) is the ith integer in the array
//Output
//   print array A in reverse order as a single line of space-separated numbers

/*Sample Input

4
1 4 3 2

Sample Output

2 3 4 1*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution7{
   private static final Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){

      // the first line is an integer N (size of array)
      int n = scanner.nextInt();

      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      if (n >= 1 && n <= 1000){
         // the second line contains N space-separated integers,array A's elements
         int[] arr = new int[n];
         String[] arrItems = scanner.nextLine().split(" ");// add spaces between ints
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         //enter string into array 
         for (int i = 0;i < n; i++) { 
            int arrItem =Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
         }
         //print array in reverse
         for (int i = n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
         }
         scanner.close();
      }
   }
}


