package Interview_Question.Recursion;

public class CheckFactrioal {

      public static void main(String[] args) {
        
         int n= 6;

          Factrioal(n);

          int x=Factrioal(n);
          System.out.println(x);
      }

      public static int Factrioal(int n)
      {
         if(n==0)
         {
            return 1;
         }

         return n*Factrioal(n-1);
      }
    
}
