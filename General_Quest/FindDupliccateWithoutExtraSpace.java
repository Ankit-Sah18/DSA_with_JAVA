package General_Quest;

import java.util.Arrays;

public class FindDupliccateWithoutExtraSpace {
    
         public static void main(String[] args) {
            
                 int[]arr= {2,3,4,5,5};

                //  for(int i=0;i<arr.length;i++)
                //  {
                //     for(int j=i+1;j<arr.length;j++)
                //     {
                //         if(arr[i]==arr[j])
                //         {
                //             System.out.println(arr[i]);
                //             //  break;
                //         }
                //     }
                   
                //  }

                Arrays.sort(arr);
                for(int i=0;i<arr.length-1;i++)
                {
                    if(arr[i]==arr[i+1])
                    {
                        System.out.println(arr[i]);
                    }
                }
                
         }
}
