package Interview_Question.PracticeDSA;

import java.util.Arrays;
import java.util.Stack;

public class stockSpan {

    public static void main(String[] args) {
        
        int[] arr={100,80,60,70,60,75,85};

        Stack<Integer> stk= new Stack<>();
        int[] ans= new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            int count=1;

            while(stk.size()>0 && arr[stk.peek()]<=arr[i]){

                  count+=ans[stk.peek()];

                  stk.pop();

            }

            stk.push(i);
            ans[i]=count;
        }

        System.out.println(Arrays.toString(ans));
    }
    
}
