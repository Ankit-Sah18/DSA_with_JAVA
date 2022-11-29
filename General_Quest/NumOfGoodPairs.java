package General_Quest;

// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

// Example 1:

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

public class NumOfGoodPairs {
    
       public static int GoodPairs(int[]arr, int n)
       {
            int left =0;
            int right=left+1;
             int count=0;
            while(left<n-1)
            {
                if(arr[left]==arr[right])
                {
                    count++;
                }

                right++;
                if(right==n)
                {
                    left++;
                    right=left+1;
                }
            }

            return count;
       }

       public static void main(String[] args) {
          
             int[]arr={1,2,3,1,1,3,5,5};
             int n=arr.length;

             int x= GoodPairs(arr, n);
             System.out.println(x);
       }

}
