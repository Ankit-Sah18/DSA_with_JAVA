package Important_Question.ArrayQuestion;

import java.util.Arrays;

public class FindSingleNumber {
    
//     Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1

         public static void main(String[] args) {
            int[]arr={2,4,6,4,6}; // 2 4 4 6 6
            Arrays.sort(arr);
            int n=arr.length;

            // int count=0;

            //   for(int i=0;i<n;i++)
            //   {

            //     count=arr[i]^count;

                
            //   }

            //   System.out.println(count);

            //2nd way...

            for(int i=0;i<arr.length-1;i=i+2)
            {
                if(arr.length==1)
                {
                    System.out.println(arr[i]);
                }

                if(arr[i]!=arr[i+1])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }

            System.out.println(arr[n-1]);
         }

}
