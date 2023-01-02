package Important_Question;

import javax.sound.sampled.SourceDataLine;

public class PrintPremutionOfString {
    
      public static void main(String[] args) {
        
           String str="abc";
           int n=str.length();
           PrintPremution(str, 0,n);
                
           System.out.println("second way.....");
           String ans=" ";

           SecondWay(str, ans);



      }

      // 1st way..
       

      public static void PrintPremution(String str, int index, int n){
              
       
          if(index==n)
          {
              System.out.println(str);
          }

          for(int i=index;i<n;i++)
          {
            str= Swap(str,index,i);
             PrintPremution(str, index+1,n);
              str=Swap(str,index,i);
          }
      }

      public static String Swap(String s, int i, int j){

          char temp;

          char[] ch= s.toCharArray();

            temp = ch[i];

            ch[i]=ch[j];
            ch[j]=temp;

            return String.valueOf(ch);
      }

      // 2nd way....

      public static void SecondWay(String str, String ans){
           
        if(str.length()==0){

            System.out.println(ans+" ");
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char c= str.charAt(i);

            String leftSting= str.substring(0, i);
            String righString= str.substring(i + 1);
            String res= leftSting+righString;

            SecondWay(res, ans+c);
        }

      }

}
