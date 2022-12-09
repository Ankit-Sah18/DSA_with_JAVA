package Interview_Question;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class JUNITDemo {

    public static void main(String[] args) {
        
        int a= 30;
        int b=29;

        int c=  Higher(a,b);
        System.out.println(c);
    }

    public static int Higher(int a, int b){

        if(a<b)
        {
            return a;
        }
        return b;
    }

    @Test
    public void TestCase(){
       assertEquals(5,Higher(3, 5));
       assertEquals(25,Higher(25, 25));
       assertEquals(9,Higher(7, 9));


    }
    
}
