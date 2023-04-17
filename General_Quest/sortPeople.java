package General_Quest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

 

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.

public class sortPeople {
    
    public static String[] SortPeople(String[]names, int[]height){

          Map<Integer,String> map= new HashMap<>();
          String[] ans= new String[names.length];

          for(int i=0;i<names.length;i++)
          {
             map.put(height[i],names[i]);
          }

          Arrays.sort(height);
           int index=0;
          for(int i=height.length-1;i>=0;i--)
          {
              ans[index++]=map.get(height[i]); 
          }
        //  System.out.println(Arrays.toString(ans));
          return ans;
    }


    public static void main(String[] args) {
    
        String[] names={"Juli","poonam","Vinit"};
        int[]height={180,165,170};
    
        byte[] bytes = {100,101,102};
        String str =new String(bytes);
        System.out.println(str);
         System.out.println(SortPeople(names,height)); 
    }

}


