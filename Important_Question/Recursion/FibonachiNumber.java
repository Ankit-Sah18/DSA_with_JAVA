package Important_Question.Recursion;

public class FibonachiNumber {

         static int n1=0,  n2=1, n3=0;


    //      // recursive
    //   public static void Fibo(int n){
         
           

    //         if(n>0)
    //         {
    //             n3=n2+n1;
    //             n1=n2;
    //             n2=n3;
    //             System.out.print(" "+n3);
    //             Fibo(n-1);
    //         }
    //   }

      public static void main(String[] args) {
        
              int n=5;

             System.out.print(n1+" "+n2);
            // Fibo(n-2);

            // using forloop

           for(int i=2; i<=n;i++)
           {
               n3=n2+n1;

               System.out.print(" "+n3);

               n1=n2;
               n2=n3;
               
           }

      }
    
}
