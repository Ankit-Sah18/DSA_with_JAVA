package General_Quest;

public class CheckPalindromeInteger {

    public static void main(String[] args) {
        
           int n=123;

           int rem, temp;
           int sum=0;

          while(n>0)
          {    
               temp=n;
                 rem=n%10;
                sum= (sum*10)+rem;
                n=n/10;

          }

          System.out.println(sum);

        


    }
    
}
