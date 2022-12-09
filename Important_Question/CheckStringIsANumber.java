package Interview_Question;

import java.util.Arrays;
import java.util.regex.Pattern;

public class CheckStringIsANumber {

    public static void main(String[] args) {
        
        // checking sting has digit or not.
        Pattern pattern = Pattern.compile(".*\\d.*");

        String str= "ankit321";

        String[] arr= str.split("");

        // System.out.println(Arrays.toString(arr));
          int count=0;
        for(String input :arr){

            if(!pattern.matcher(input).matches()){

                count++;
            }

            // System.out.println(pattern.matcher(input).matches());
        }

        System.out.println(count);

        // check a sting has 6 digit number or not;

        Pattern p= Pattern.compile("\\d{6}");

        String str2= "12345";

        if(p.matcher(str2).matches()){

            System.out.println("Yes String has 6 digit number..");
        }
        else
        {
            System.out.println("No...");
        }
    }
    
}
