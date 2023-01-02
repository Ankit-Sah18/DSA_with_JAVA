package Important_Question;

public class checkPalindrrome {
    
    public static void main(String[] args) {
        
        String str="mada";

        boolean x= CheckStringPalindrome(str);
        System.out.println(x);
    }

    public static boolean CheckStringPalindrome(String str){

        //   StringBuilder new_str= new StringBuilder("");
        String new_str="";

          for(int i=str.length()-1;i>=0;i--)
          {
            //   new_str.append(str.charAt(i));
            new_str+=str.charAt(i)+"";
          }

          System.out.println(new_str);
        if(str.equals(new_str))
        {
            return true;
        }

        return false;

    }
}
