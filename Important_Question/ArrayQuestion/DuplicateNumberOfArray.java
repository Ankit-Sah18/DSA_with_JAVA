package Important_Question.ArrayQuestion;

import java.util.Arrays;

public class DuplicateNumberOfArray {

      public static void main(String[] args) {
        
          int[]arr= {2,4,3,2,4,3,5,7,6,7,8,};

             int n=arr.length;
             Arrays.sort(arr);

            //  for(int i=0;i<n-1;i++)
            //  {
            //     for(int j=i+1;j<n;j++)
            //     {
            //         if(arr[i]==arr[j]){
            //             System.out.println(arr[j]);
            //         }
            //     }
            //  }

            for(int i=0;i<n-1;i++)
            {
                if(arr[i]==arr[i+1])
                {
                    System.out.println(arr[i]);
                }
            }
      }
    
}
