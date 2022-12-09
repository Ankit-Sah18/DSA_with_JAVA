package Interview_Question.PracticeDSA;

public class checkPalindrome {
    
      public static void main(String[] args) {
        
          String str="abcba";

          boolean x=  checkStringPalindrome(str);
          System.out.println(x);


      }

      public static boolean checkStringPalindrome(String str){

        int start=0;
        int end= str.length()-1;

        while(start<=end){

            if(str.charAt(start)!=(str.charAt(end))){

                 return false;

                 

            }

            start++;
            end--;
        }

         return true;
      }


}
