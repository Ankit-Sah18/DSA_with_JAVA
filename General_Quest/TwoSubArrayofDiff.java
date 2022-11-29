 
//   question-
//   Split array into two subarrays such that difference of their sum is minimum
// TC-O(n);
// SC-O(1);

package General_Quest;

import java.util.Scanner;

public class TwoSubArrayofDiff{

       static int DiffTwoSubArray(int arr[],int n){

            int sum=0; // find total sum

            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }

            int presum=0; //find sum except of last element of array.
            int min= Integer.MAX_VALUE;

            for(int i=0;i<n-1;i++)
            {
                presum+=arr[i];
                // System.out.println(presum+" , pre");

                int diff=Math.abs(sum-presum-presum);

                // System.out.println(diff);

                if(diff<min)
                {
                    min=diff;
                }

               
               
            }
            return min;

           
           
       }

       public static void main(String[] args) {
        
        int [] arr= {7,9,5,10,5};
         int n=arr.length;

        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter Size of Array");
        // int n=sc.nextInt();

        // int [] arr= new int[n];

        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter Element of array");
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Result");

         int diff=DiffTwoSubArray(arr, n);
          System.out.println(diff);
           
       }
    
}