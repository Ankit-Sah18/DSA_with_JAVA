package Important_Question.ArrayQuestion;

import java.util.Arrays;

public class SearchSortedArray {
     
    public static void main(String[] args) {
    
        int[]arr={5,1,3};
        // Arrays.sort(arr);
        int target=3;
        int n=arr.length; 
        // System.out.println(5+(6-5)/2);
  
         int x= FindSearchSortedArray(arr,n,target);
         System.out.println(x);
    }
  
    public static int FindSearchSortedArray(int[]arr, int n, int target){
          
      int low=0;
      int high=n-1;

      int mid;

    //   if(arr[0]<arr[1] && arr.length==2)
    //   {
    //     return 1;
    //   }
  
      while(low<=high)
      {
           mid= low+(high-low)/2;
  
          if(arr[mid]==target)
          {
              return mid;
          }
  
          if(arr[low]<=arr[mid])
          {
              if(target>=arr[low] && target<=arr[mid] )
              {
                  high=mid-1;
              }
              else
              {
                  low=mid+1;
              }
          }
          else
          {
              if(target<=arr[high]&& target>=arr[mid])
              {
                  low=mid+1;
              }                                          
              else
              {
                  high=mid-1;
              }
          }
      }
  
        return -1;
  
    }

    
    
}
