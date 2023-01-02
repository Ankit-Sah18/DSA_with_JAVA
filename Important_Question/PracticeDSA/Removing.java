package Important_Question.PracticeDSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Removing {

    public static void main(String[] args) {
        
        int count=0;
        String s="ababa";
        Map<Character,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }

        // System.out.println(map);
          int min= Integer.MAX_VALUE;
         for(Map.Entry<Character,Integer> keys : map.entrySet()){
           
            int x=keys.getValue();

            if(x<min)
            {
                min=x;
            }
         }

         System.out.println(min);
    

       

        // int n=s.length();
        // int l=0;
        // int r= n-1;

        // for(int i=0;i<n;i++)
        // {
        //     stk.add(s.charAt(i));
        // }

        // while(l<r)
        // {
        //     if(s.charAt(l)!=s.charAt(r))
        //     {
        //         count++;
                
        //     }
        // }



    }
    
}
