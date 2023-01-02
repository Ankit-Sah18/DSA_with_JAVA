package Important_Question.Recursion;

// juli take step 1, 2 or 3 at a time 

public class NumOfWay {

    public static void main(String[] args) {
        int n=4;
        int x= Way(n);
        System.out.println(x);
    }

    public static int Way(int n)
    {
        if(n<0)
        {
            return 0;
        }

        if(n==0)
        {
            return 1;
        }
        return Way(n-1)+Way(n-2)+Way(n-3);
    }


    
}
