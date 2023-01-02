package Important_Question.PracticeDSA;

public class Multiplicattion {

    protected void method1() {}
  private void method2() {}
  public void method3() {}
//   default void method4() {}

    final static  int x;
    int count=0;
    static {
        x = 10;

        new Multiplicattion(x);
       
    }

    Multiplicattion(int x)

    {
        // System.out.println(this.x);
        System.out.println(++count);
        System.out.println(++count * x);
    }

    public static void main(String[] args) {
        
        Multiplicattion multi= new Multiplicattion(30);

       
    }
    // Multi(int x){
    //     System.out.println(x * this.x);
    // }

    // public static void main(String[] args) {

    //     Multi multi = new Multi(10);
    // }
    
}
