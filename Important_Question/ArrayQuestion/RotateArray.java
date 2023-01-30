package Important_Question.ArrayQuestion;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        
          int[]arr= {2,3,4,1,5,6,3};
          int k=3;

          // 1st way

          if(k>arr.length)
          
            
            k=k%arr.length;
          

          // int[] ans= new int[arr.length];

          // for(int i=0;i<k;i++)
          // {
          //   ans[i]=arr[arr.length-k+i];
          // }
          // System.out.println(Arrays.toString(ans));
          // int j=0;

          // for(int i=k;i<arr.length;i++)
          // {
          //   ans[i]=arr[j];
          //   j++;
          // }

          // System.out.println(Arrays.toString(ans));

          // using bubble sort algorithm

          for(int i=0;i<k;i++)
          {
            for(int j=arr.length-1;j>0;j--)
            {

              // System.out.println(arr);
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;


            }
           
            
          }

          System.out.println(Arrays.toString(arr));

          

         

    }
    
}
