package Interview_Question.PracticeDSA;

import java.util.HashMap;
import java.util.Map;

public class checkAnagram {

    public static void main(String[] args) {
        
          String str1= "ankitjuli";
          String str2="tiknaliju";

        boolean x=  AnagramChecking(str1,str2);
        System.out.println(x);
    }


    public static boolean AnagramChecking(String str1, String str2){


          Map<Character, Integer> map= new HashMap<>();

          for(int i=0;i<str1.length();i++)
          {
            if(map.containsKey(str1.charAt(i))){

                  map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }

            else{

                map.put(str1.charAt(i), 1);
            }
          }

        //   System.out.println(map);

          for(int i=0;i<str2.length();i++)
          {
            if(map.containsKey(str2.charAt(i))){

                map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            }
            else
            {
                return false;
            }
          }

        //   System.out.println(map);

          for(Map.Entry<Character,Integer> keyvalue : map.entrySet()){
                
                if(keyvalue.getValue()!=0)
                {
                    return false;
                }
          }

          return true;
    }
    
}
