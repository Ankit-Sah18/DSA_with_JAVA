package Important_Question.ArrayQuestion;

public class MaxAndMinElementOfArray {

    public static void main(String[] args) {
        
           int[]arr={2,3,5,1,5,6,7,3,900000000};

           int min= Integer.MAX_VALUE;
           int max=Integer.MIN_VALUE;

           for(int i=0;i<arr.length;i++)
           {
             if(arr[i]>max)
             {
                max=arr[i];
             }
             if(arr[i]<min)
             {
             min=arr[i];
           }
         }

         System.out.println(min+"==="+max);

    }
    
}
