import java.util.Scanner;

public class Solution3 {
   private static final Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      int N = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      if(N>=1 && N<=100) {
         //        If  is odd, print Weird
         if(N%2==0==false) {
            System.out.println("Weird");
            //System.out.println("Weird1");

         }
         //        If  is even and in the inclusive range of 2 to 5, print Not Weird
         if(N%2==0) {
            if(N>=2 && N<=5) {
               System.out.println("Not Weird");
               //System.out.println("Weird2");

            }
            //          If  is even and in the inclusive range of 6 to 20, print Weird
            else if(N>=6 && N<=20) {
              System.out.println("Weird");
              //System.out.println("Weird3");

            }
            //        If  is even and greater than 20, print Not Weird
            else if(N>=20) {
               System.out.println("Not Weird");
               //System.out.println("Weird4");

            }
         }
      }

      scanner.close();
   }
}
