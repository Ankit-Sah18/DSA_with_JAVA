// Most Frequent Even Element

// Given an integer array nums, return the most frequent even element.

// If there is a tie, return the smallest one. If there is no such element, return -1.

 

// Example 1:

// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.
// Example 2:

// Input: nums = [4,4,4,9,2,4]
// Output: 4
// Explanation: 4 is the even element appears the most.


package General_Quest;

import java.util.Map;
import java.util.TreeMap;

public class MostFrequantNumber {
    
      public static void FrequentNumber(int[] arr,int n){

          Map<Integer,Integer>map= new TreeMap<>();

          for(int i=0;i<n;i++)
          {
           if(arr[i]%2==0)
           {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           }
          }

          System.out.println(map);

            int min=-1;
            int max= Integer.MIN_VALUE;

            for(int key : map.keySet()){

                int val= map.get(key);

                if(val>max)
                {
                    max= val;
                    min=key;
                }

            }

            System.out.println(min);

        }

      public static void main(String[] args) {
         int[] arr={2,1,3,4,4,2,6,5,4};
         int n=9;
         FrequentNumber(arr,n);

      }
}
