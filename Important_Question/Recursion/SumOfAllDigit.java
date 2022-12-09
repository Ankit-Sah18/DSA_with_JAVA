package Interview_Question.Recursion;

public class SumOfAllDigit {

    public static void main(String[] args) {
        
        int n=1234569;

       int x=  CalculateSumOfAllDigit(n);
       System.out.println(x);
    }

    public static int CalculateSumOfAllDigit( int n){
     
        if(n==0)
        {
            return 0;
        }

        return n%10+CalculateSumOfAllDigit(n/10);

    }
    
}
