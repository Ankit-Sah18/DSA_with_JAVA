package Important_Question.Recursion;

public class SortArrayBubbleSort {

    public static void main(String[] args) {
        
        // int[] arr={3,4,5,2,7,19,3};
        int[] arr={2,3,4,5};
        int n=arr.length;

        SortWithBubbleSort(arr,n);
    }

    public static void SortWithBubbleSort(int[]arr, int n)
    {
        if(n<=0)
        {
            return;
        }

        for(int i=0;i<n-1;i++)
        {
           
           if(arr[i]>arr[i+1]){
                
            int temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
           }
              
           
            
        }
        SortWithBubbleSort(arr, n-1);
          System.out.print(arr[n-1]+" ");

    }
    
}
