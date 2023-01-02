package Important_Question.PracticeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintStarInEmail {
    
    public static void main(String[] args) {
        
      
        
            String str= "juli@gmail.com";
  
            // ArrayList<Character> arr= new ArrayList<>();
            // StringBuilder sb= new StringBuilder("");
  
            for(int i=0;i<str.length();i++)
            {
              if(i%2==0)
              {
                //   arr.add('*');
                // sb.append("*");
                System.out.print("*"+" ");
              }
              else
              {
                //   arr.add(str.charAt(i));
                // sb.append(str.charAt(i));
                System.out.print(str.charAt(i)+" ");
              }
  
             
            }
            System.out.println("\n");
             
            Integer[] arr= {1,2,3,4,5};
            Arrays.asList(arr);
            ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(arr));
            System.out.println(arr1);

                // Collections.addAll(arr1, arr);



            // arr1.add(2);

            // for(int i=0;i<arr.length;i++)
            // {
            //     Integer a= arr[i];
            //     arr1.add(a);
            // }

            // System.out.println(arr1);

           


            

            int a=9;

        //    int[] x= arr.clone();
        //    System.out.println(Arrays.toString(x));

            // System.out.println(sb);
    }
     
}
