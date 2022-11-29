//    question:-
//    Split an array into two equal Sum subarrays
//    TC=O(N)
//    SC=O(1)


package General_Quest;

public class TwoSubArray {
    
       static int BreakPointOfArray(int arr[],int n)
       {
               int leftsum= 0;

               for(int i=0;i<n;i++)
               {
                leftsum+=arr[i];
               }

               int rightsum=0;

               for(int i=n-1;i>=0;i--)
               {
                  rightsum+=arr[i];

                  leftsum-=arr[i];
                  if(rightsum==leftsum)
                  {
                    return i;
                  }

                  
               }

               return -1;
       }


       static void printTwoParts(int arr [],int n)
       {
          int breakp=BreakPointOfArray(arr, n);

          if(breakp==-1 || breakp==n)
          {
            System.out.println("Not Possible");
            return;
          }
         for(int i = 0; i < n; i++)
         {
            if(breakp == i)
               System.out.println();

            System.out.print(arr[i] + " "); // consider in print only not printIn
           

         }
                 
      
       }
   

       public static void main(String[] args) {
           int [] arr= {1,2,3,4,5,5};
           int n=arr.length;

           printTwoParts(arr, n);
        
       }

   
  
        // // Returns split point. If not possible, then
        // // return -1.
        // static int findSplitPoint(int arr[], int n)
        // {
          
        // // traverse array element and compute sum
        // // of whole array
        // int leftSum = 0;
          
        // for (int i = 0 ; i < n ; i++)
        //    { leftSum += arr[i];
        // }
      
        // // again traverse array and compute right 
        // // sum and also check left_sum equal to 
        // // right sum or not
        // int rightSum = 0;
          
        // for (int i = n-1; i >= 0; i--)
        // {
        //     // add current element to right_sum
        //     rightSum += arr[i];
      
        //     // exclude current element to the left_sum
        //     leftSum -= arr[i] ;
      
        //     if (rightSum == leftSum)
        //         return i ;
        // }
      
        // // if it is not possible to split array
        // // into two parts.
        // return -1;
        // }
      
        // // Prints two parts after finding split 
        // // point using findSplitPoint()
        // static void printTwoParts(int arr[], int n)
        // {
        //     int splitPoint = findSplitPoint(arr, n);
          
        //     if (splitPoint == -1 || splitPoint == n )
        //     {
        //         System.out.println("Not Possible" );
        //         return;
        //     }
        //     for (int i = 0; i < n; i++)
        //     {
        //         if(splitPoint == i)
        //             System.out.println();
                      
        //         System.out.print(arr[i] + " ");
        //     }
        // }
      
        // // Driver program
        // public static void main (String[] args) {
          
        // int arr[] = {1 , 2 , 3 , 4 , 5 , 5 };
        // int n = arr.length;
          
        // printTwoParts(arr, n);
              
        // }

}
