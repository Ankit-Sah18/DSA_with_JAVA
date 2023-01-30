package Important_Question.ArrayQuestion;

import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class PairsEqualsSum {

    public static void main(String[] args) {
        
        int[] arr={2,4,3,5,6,-2,7,8,8}; // -2,2,3,4,5,6,7,8,9
        int target=15;
   int count=0;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //           int sum=arr[i]+arr[j];
        //           if(sum==target)
        //           {
        //             count++;
        //           }
        //     }

        // }

        Arrays.sort(arr);

        int left=0;
        int right=arr.length-1;

        while(left<right)
        {
             if(arr[left]+arr[right]==target)
             {
                System.out.println(arr[left]+"  "+arr[right]);
                count++;
                left++;
                right--;
             }
             else if(arr[left]+arr[right]<target)
             {
                  left++;
             }
             else{
             right--;
        }
       
    }

     System.out.println(count);
}
    
}
