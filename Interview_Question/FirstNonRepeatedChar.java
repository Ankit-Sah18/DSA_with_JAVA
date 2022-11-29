package Interview_Question;

import java.text.BreakIterator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {
    
      public static char NonRepeatedChar(String str){
          // using hashMap...
        // char[] ch= str.toCharArray();

        //    Map<Character, Integer> map= new HashMap<>();

        //    for(Character c :ch){
            
        //     if(map.containsKey(c)){

        //         map.put(c, map.get(c)+1);
        //     }

        //     else
        //     {
        //         map.put(c, 1);
        //     }

        //    }

        // //    System.out.println(map);

        // //    Set<Entry<Character, Integer>>keys= map.entrySet();

        // //    System.out.println(keys);

        // for(int i=0;i<str.length();i++)
        // {
        //     char c= str.charAt(i);

        //     if(map.get(c)==1)
        //     {
        //         return c;
                
        //     }
        // }

        //   throw new  RuntimeException("Element not found");

          // 2nd way using LinkedHashMap...

          char[] ch= str.toCharArray();

          Map<Character, Integer> map= new LinkedHashMap<>();

          for(Character c : ch){

            if(map.containsKey(c)){

                map.put(c,map.get(c)+1);
            }

            else
            {
                map.put(c,1);
            }
          }

          for(Entry<Character,Integer> entry : map.entrySet()){
              
                if(entry.getValue()==1)
                {
                   return entry.getKey();
                }
          }


          throw new RuntimeException("char not found...");

      }

      public static void main(String[] args) {
        
         String str= "poonamankit";

           System.out.println(NonRepeatedChar(str)); 
      }


      



}
