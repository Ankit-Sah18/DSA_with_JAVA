package Important_Question;

public class SwapTwoValueWithoutThirdVari{

    public static void main(String[] args) {
        
        int a= 30;
        int b=20;

        System.out.println("before Swaping --"+ a+" "+b);

        a= a+b;
        b=a-b;
        a=a-b;

        // after swaping 

        System.out.println("after swaping--"+ a+" "+b); // but here is limition of max int value or min int value so avoid this sistution we can use bit 
        // manipulation to solve this issue that will  be best solution here..
     System.out.println("\n");
        int x= Integer.MAX_VALUE;
        int y= 10;

        System.out.println("before swaping "+x+" "+y);

        x=x+y;
        // y=x-y;
        // x=x-y;

        System.out.println("after swaping "+x+" "+y);


        // using XOR or bit manipulation....

        int p=40;
        int q= 50;

        p=p^q;
        System.out.println("p value--"+p);
        q=p^q;
        System.out.println("q value--"+q);
        p=p^q;
        System.out.println("p value--"+p);
        System.out.println(p+"-"+q);
    }
}