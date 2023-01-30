package Important_Question.ArrayQuestion;

import java.util.Scanner;

public class FindMissingNumber {
   
     public static void main(String[] args) {
        
           int[]arr={1,2,3,4,5,7,9,12};
           int n=arr.length;

           int count=0;

           for(int i=arr[0];i<arr[n-1];i++)
           {
              
                if(arr[count]==i)
                {
                  count++;
                }
                else
                {
                  System.out.print(i+" ");
                }
              
           }


     }
    
}
