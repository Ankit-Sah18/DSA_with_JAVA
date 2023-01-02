package Important_Question.Recursion;

public class CheckGCD {

    public static void main(String[] args) {
        
          int a=60;
          int b=36;

         int x= GCD(a,b);

         System.out.println(x);

    }

    public static int GCD(int a, int b){

         if(a==0)
         {
            return b;
         }

         return GCD(b%a,a);
    }
    
}
