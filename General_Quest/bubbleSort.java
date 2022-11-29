package General_Quest;

// import java.util.Scanner;

public class bubbleSort {
    
      
      public static void BubbleSort( int arr[], int size)
      {
            int n=arr.length;

            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }


      }


    static void PrintArray(int arr[],int size)
    {
        String bag="";

        for(int i=0;i<size;i++)
        {
            bag=bag+arr[i]+" ";
        }

        System.out.println(bag);
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        
           int[] arr= {4,2,5,6,3,7};
           int n=arr.length;

           BubbleSort(arr, n);
           System.out.println("Sorted Array");
           PrintArray(arr, n);
         
    }

           
}
