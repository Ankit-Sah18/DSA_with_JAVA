package Important_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class CheckAnagram {
    
    public static boolean checking_Anagram(String str1, String str2){

        //   // 1st way with time complexcity nlogn;
        //   char[] arr1= str1.toCharArray();
        //   char[] arr2= str2.toCharArray();

        //   Arrays.sort(arr1);
        //   Arrays.sort(arr2);
        // //   System.out.println(arr1.hashCode());
        // //   System.out.println(arr2.hashCode());

        //   for(int i=0;i<arr1.length;i++)
        //   {
        //     if(arr1[i]!=arr2[i])
        //     {
        //         return false;
        //     }
        //   }

        //   return true;

        // // return Arrays.equals(arr1, arr2);

        // using HashMap and it will be give time complexcity O(n) and space O(1) and worst condition O(n)

        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0;i<str1.length();i++)
        {
            if(map.containsKey(str1.charAt(i)))
            {
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }
            else{

                map.put(str1.charAt(i),1);
            }
        }

        System.out.println(map+"--first string");

        for(int i=0;i<str2.length();i++)
        {
            if(map.containsKey(str2.charAt(i))){

                map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
 
            }
            else
            {
               return false;

            }

            
           
        }

        System.out.println(map+"--after second string");

        Set<Character> keys = map.keySet();

        for(Character key : keys){

            if(map.get(key)!=0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        String str1="ankita";
        String str2= "tikna";

       boolean x=  checking_Anagram(str1, str2);
       System.out.println(x);

    }
}
