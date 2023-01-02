package Important_Question;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckRotationOfString {
    
      public static void main(String[] args) {
        
          String str1= "ankit";
          String str2="nkitp";

          boolean x=  RotationOfString(str1,str2);
          System.out.println(x);
      }

      public static boolean RotationOfString(String str1, String str2){
        
        boolean isrotated=false;

          if(str1.length()!=str2.length())
          {
            return false;
          }
          else{

               String concancated= str1+str1;
               System.out.println(concancated);

               isrotated= concancated.contains(str2);
          }
          return isrotated;
      }


      @Test
      public void testIsRotatedVersion(){ 
       assertTrue(RotationOfString("abc","cab"));
       assertFalse(RotationOfString("poonam","ankit"));
       assertTrue(RotationOfString("df","df"));
       assertFalse(RotationOfString("abcsd","cabse"));
       assertFalse(RotationOfString("abcsd","cabse"));
       assertFalse(RotationOfString("ankit","kita"));
         //  assertTrue(isRotatedVersion("abc", "cab")); 
         //  assertFalse(isRotatedVersion("abc", "bac"));
         //   assertFalse(isRotatedVersion("abc", null)); 
         //   assertFalse(isRotatedVersion("abc", "")); 
         
         }
}


