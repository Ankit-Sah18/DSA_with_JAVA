package Interview_Question.Recursion;

public class PrintElementOfArray {

    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,1};

        int n= arr.length;

        PrintElememt(arr,n);
    }

    public static void PrintElememt(int[]arr,int n){

        if(n<=0)
        {
            return;
        }

        System.out.print(arr[n-1]+" ");
         PrintElememt(arr,n-1);

       
    }
    
}
