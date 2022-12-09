package Interview_Question.Recursion;

import javax.lang.model.element.Element;

public class PrintElementOfString {

    public static void main(String[] args) {
        
        String str="Poonam";
        int n=str.length();

        ElementOfString(str,n);
    }

    public static void ElementOfString(String str, int n)
    {
        if(n<=0)
        {
            return;
        }

        // System.out.print(str.charAt(n-1)+"");
         ElementOfString(str, n-1);
         System.out.print(str.charAt(n-1)+"");
        
    }

     
    
}
