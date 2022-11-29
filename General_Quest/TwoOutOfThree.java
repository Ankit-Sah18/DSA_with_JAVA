package General_Quest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least 
// two out of the three arrays. You may return the values in any order.
 

// Example 1:

// Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
// Output: [3,2]
// Explanation: The values that are present in at least two arrays are:
// - 3, in all three arrays.
// - 2, in nums1 and nums2.


public class TwoOutOfThree {
    
      public static List<Integer> TwoOutThreeArray(int[]nums1,int[]nums2,int[]nums3)
      {
        Set<Integer> set1= new HashSet<>();
        Set<Integer> set2= new HashSet<>();
        Set<Integer> set3= new HashSet<>();
        List<Integer> ans= new ArrayList<>();

        for(int s:nums1){
             set1.add(s);
        }
        for(int s:nums2){
            set2.add(s);
       }
       for(int s:nums3){
        set3.add(s);
       }

       for(int a: set1)
       {
          if(set2.contains(a))
          {
            ans.add(a);
          }
       }

       for(int a :set2)
       {
        if(set3.contains(a) && !set1.contains(a))
        {
            ans.add(a);
        }

        
       }

       for(int a: set3)
       {
        if(set1.contains(a) && ! set2.contains(a))
        {
            ans.add(a);
        }
       }

       return ans;
          
      }

    public static void main(String[] args) {
        int[]nums1={1,1,3,2};
        int[]nums2={2,3};
        int[]nums3={3,1,2};

       
        System.out.println( TwoOutThreeArray(nums1,nums2,nums3));
    }
}
