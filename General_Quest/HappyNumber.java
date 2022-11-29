// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.
package General_Quest;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber{

      public static boolean happyNumber(int n)
      {
           Set<Integer> set= new HashSet<>();

           while(true){
                
            int sum=0;

            while(n!=0)
            {
                int r=n%10;

                sum+=r*r;

                n=n/10;
            }

            if(sum==1)
            {
                return true;
            }
            else if( set.contains(sum))
            {
                return false;
            }
            else
            {
                set.add(sum);
                n=sum;
            }
           }
      }


      public static void main(String[] args) {
        
         boolean x= happyNumber(2);
         System.out.println(x);
      }
}

