package General_Quest;
// given a string s consisting of lowercase English letters, return the first letter to appear twice.

import java.util.HashMap;
import java.util.Stack;

// Note:

// A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
// s will contain at least one letter that appears twice.
 

// Example 1:

// Input: s = "abcbdaacz"
//input s="abccbaacz"
// Output: "c"
// Explanation:
// The letter 'a' appears on the indexes 0, 5 and 6.
// The letter 'b' appears on the indexes 1 and 4.
// The letter 'c' appears on the indexes 2, 3 and 7.
// The letter 'z' appears on the index 8.
// The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.


public class firstLetterApearTwice {

    public static void main(String[] args) {
        
        String str="abcbbdaacz";
        HashMap<Character,Integer> map= new HashMap<>();
        Stack<Character> stk= new Stack<>();

        // for(int i=0;i<str.length();i++)
        // {
        //     if(map.containsKey(str.charAt(i)))
        //     {
        //         System.out.println(str.charAt(i));
        //         break;
        //     }
        //     else
        //     {
        //         map.put(str.charAt(i),1);
        //     }
        // }

          for(int i=0;i<str.length();i++)
          {
              if(stk.isEmpty())
              {
                 stk.push(str.charAt(i));
              }
              else
              {
                 if(stk.peek()==str.charAt(i))
                 {
                    System.out.println(stk.peek());
                    break;
                 }
                 else
                 {
                    stk.push(str.charAt(i));
                 }
              }
          }
    }
    
}
