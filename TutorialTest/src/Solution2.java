import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2 {
   static void solve(double meal_cost, int tip_percent, int tax_percent) {
      double var1=(meal_cost*(tip_percent/100.00));
      double var2=(meal_cost*(tax_percent/100.00));
      double total_cost=(meal_cost+var1+var2);
      System.out.println((int)Math.round(total_cost));
   }
   private static final Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
      double meal_cost = scanner.nextDouble();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      int tip_percent = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      int tax_percent = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      solve(meal_cost, tip_percent, tax_percent);
      scanner.close();
   }
}