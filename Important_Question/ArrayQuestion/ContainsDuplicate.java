package Interview_Question.ArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

   public static void main(String[] args) {
    
       int[]arr={3,5,6,7,1,2,3};
       int[]arr1={3,5,1,6,2};

       boolean x= BruteForceApproch(arr,arr.length);
       System.out.println(x);

         boolean a=  HashMapApproch(arr1);
         System.out.println(a);
   }

   public static boolean BruteForceApproch(int[] arr, int n)
   {
    // tc= O(n);
       for(int i =0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
             if(arr[i]==arr[j])
             {
                return false;
             }
        }
       }

       return true;
   }

   public static boolean HashMapApproch(int[]arr){

       Map<Integer, Integer> map= new HashMap<>();

       for(int i=0;i<arr.length;i++)
       {
          if(map.containsKey(arr[i]))
          {
              map.put(arr[i], map.get(arr[i])+1);
          }
          else
          {
            map.put(arr[i], 1);
          }
       }

    //    System.out.println(map);

       for(Map.Entry<Integer,Integer> key: map.entrySet()){
           
          if(key.getValue()>1)
          {
            return false;
          }
       }

       return true;
   }
    
}
