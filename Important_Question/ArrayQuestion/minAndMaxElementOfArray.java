package Important_Question.ArrayQuestion;

import java.util.Arrays;

public class minAndMaxElementOfArray {

    public static void main(String[] args) {
        
        int[]arr= {23,54,1995214865,100,35};

        FindMinAndMax(arr);
    }

    public static void FindMinAndMax(int[]arr){
          int min= Integer.MAX_VALUE;
          int max= Integer.MIN_VALUE;
        if(arr.length==1)
        {
            min=arr[0];
            max=arr[0];
        }

        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]){
                min=arr[i];

            }

            if(max<arr[i]){

                max=arr[i];
            }
        }

        System.out.println(max+" "+min);

        // Time complexcity- O(n);
    // space complexcity- O(1);

    // 2nd way....

       Arrays.sort(arr);

       System.out.println("Max= "+arr[arr.length-1]+" "+"Min= "+arr[0] );

       // TC- O(nlogn);
       // Sc- O(1);
    }

    

      
    
}
