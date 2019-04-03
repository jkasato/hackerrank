//Hash Maps-given names n and phone numbers, make a phone book that 
//maps friends names to phone numbers
//for each name queried, print the associated entry 
//    from your phone book on a new line in the form name=phoneNumber
//    if an entry is not found, print "Not found"
//Input
//   number of entries n
//   friends name 8 digit phone number on a new line
//Constraints
//   1<=n<=10^5
//   1<=queries<=10^5
//Output
//   print the full name and phone number
//   print "Not found" if not found
//Sample Input
//   3
//   sam 99912222
//   tom 11122222
//   harry 12299933
//   sam
//   edward
//   harry
//   
//Sample Output
//   sam=99912222
//   Not found
//   harry=12299933
import java.util.*;
import java.io.*;
class Solution8{
   public static void main(String []argh){
      HashMap<String, Integer> map = new HashMap<String,Integer>();//make HashMap of String and Integer 
      Scanner input = new Scanner(System.in);//input text
      int entries = input.nextInt();//stores text as entrues
      for(int i = 0; i < entries; i++){//for all entries
         String name = input.next();//store entries as name
         int phone = input.nextInt();//store phone number
         input.nextLine();
         map.put(name,phone);//store name and phone in map with put function 
      }
      while(input.hasNext()){//while input has another number ready
         String key = input.next();//
         if (map.containsKey(key)) { //if the map has s
            Integer value = map.get(key); //use the get function in map to get s
            System.out.println(key+"=" + value); 
         }
         else {
            System.out.println("Not found");
         }       
      }
      input.close();
   }
}



