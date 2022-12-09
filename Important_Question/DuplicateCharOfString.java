package Interview_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class DuplicateCharOfString {

    public static void duplicateChar(String str){
        
        // tc= O(nlogn)
        // String[] arr= str.split("");
        // Arrays.sort(arr);
        // // System.out.println(arr);

        // for(int i=0;i<arr.length-1;i++)
        // {
        //     // for(int j=i+1;j<arr.length;j++)
        //     // {
        //     //     if(arr[i].equals(arr[j]))
        //     //     {
        //     //         System.out.println(arr[i]);
        //     //     }
              
        //     // }

        //     // System.out.println(arr[i]);

        //     if(!arr[i].equals(arr[i+1]))
        //          {
        //             System.out.println(arr[i]);
        //         }
           
        // }

        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i))){

              map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i), 1);
            }
        }

         Set<Character> keys= map.keySet();

         for(Character key :keys)
         {
            if(map.get(key)>1)
            {
                System.out.println(key);
            }
         }



    }
        
    public static void main(String[] args) {
        
       String str= "AnkitSahai";

    //    System.out.println(str.length()-1);

          duplicateChar(str);


    }

    
    
}
