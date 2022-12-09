package Interview_Question.ArrayQuestion;

public class ReverseArray {

    public static void main(String[] args) {
        
        int[]arr={2,4,1,5,6,12};

        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" \n");
          // using recursion

        UsingRecursion(arr,0,arr.length);


    }

    

    public static void UsingRecursion(int[]arr,int index, int n)
    {
         if(n==index)
         {
            return;
         }

         int bag=arr[index];

         UsingRecursion(arr, index+1, n);
        
         System.out.print(bag+" ");


    }


    
}
