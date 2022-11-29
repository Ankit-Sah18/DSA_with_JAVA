// question-
// Given an array of integers, find if it’s possible to remove exactly one integer from the
//  array that divides the array into two subarrays with the same sum.
// Input:  arr = [6, 2, 3, 2, 1]
// Output:  true
// Explanation:  On removing element 2 at index 1,
// the array gets divided into two subarrays [6]
//  and [3, 2, 1] having equal sum

package General_Quest;

public class TwoSubArray2 {
    
    static int divideArray(int arr[], int n)
    {
        // sum stores sum of all elements of the array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
  
        // sum stores sum till previous index of the array
        int sum_so_far = 0;
  
        for (int i = 0; i < n; i++)
        {
            // If on removing arr[i], we get equals left
            // and right half
            if (2 * sum_so_far + arr[i] == sum)
            {
                System.out.print("The array can be divided into "
                    +"two subarrays with equal sum\nThe"
                    +" two subarrays are - ");
                // printSubArray(arr, 0, i - 1);
                // printSubArray(arr, i + 1, n - 1);
  
                return i;
            }
            // add current element to sum_so_far
            sum_so_far += arr[i];
        }
  
        // The array cannot be divided
        System.out.println("The array cannot be divided into two "
                +"subarrays with equal sum");
                 
        return -1;
    }

       static void printTwoParts(int arr[],int n)
       {
          int breakp=divideArray(arr, n);
          if(breakp==-1 || breakp==n)
          {
             System.out.println("not Possible");
             return;
          }
          for(int i =0;i<n;i++)
          {
               if(breakp==i)
               System.out.println();

               System.out.print(arr[i] + " ");
          }
       }
     
    // Driver program
    public static void main (String[] args)
    {
        int arr[] = {6, 2, 3, 2, 1};
        int n = arr.length;
  
        printTwoParts(arr, n);
    }


}
