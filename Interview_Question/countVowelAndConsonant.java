package Interview_Question;

import java.util.Scanner;
import java.util.regex.Pattern;

import javax.lang.model.util.ElementScanner6;

public class countVowelAndConsonant {

    public static void CountVowelAndCon(String str){

          char[] arr= str.toCharArray();

          int vow=0;
          int con=0;

          for(Character c : arr){

            if(Pattern.matches("[aeiou]", Character.toString(c))){

               vow++;
            }
            else{
                con++;
            }
          }

          System.out.println("vowel-->"+vow+"\n"+"consonant-->"+con);
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

       

        System.out.println("Enter character of string..");

        String str= sc.next();

        CountVowelAndCon(str);
    }
    
}
