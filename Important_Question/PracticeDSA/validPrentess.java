package Interview_Question.PracticeDSA;

import java.util.Stack;

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if
//  the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true

public class validPrentess {

  public static void main(String[] args) {
    
       String str="{}";

      boolean x=  checkPrenthess(str);
      System.out.println(x);
  }

  public static boolean checkPrenthess(String str){

      Stack<Character> stk= new Stack<>();

       for(char c : str.toCharArray()){
           
            if(c=='('){
                stk.push(')');
            }
            else if(c=='{')
            {
                stk.push('}');
            }
            else if(c=='['){
                stk.push(']');
            }

            

          else  if(stk.isEmpty() || stk.pop()!=c)
          System.out.println(stk);
           return false;
        //  return true;

      
           
          
       }

       System.out.println(stk);

        if(!stk.isEmpty())
        {
            return false;
        }
           
        return true;
           
        
           
        
  }
    
}
