package Important_Question.PracticeDSA;

public class A {

    void print()
    {
        System.out.println("method1....");

    }

    // public A()
    // {
    //     System.out.println("Class A");
    // }

    


    
    
}

class B extends A{
   
    void print()
    {
        System.out.println("method2..");
    }

    // public B (){
    //     System.out.println("Class B");
    // }

    public static void main(String[] args) {
        
        // B obj1 = new B();	
        // obj1.method1();
        // obj1.method2();
        
        // A obj4 = new A();
        // obj4.method1();

        // A obj2 = new B();
        // obj2.method1();
    	
        // B obj3 = new A();
    //     A obj2 = new B();obj2.print();	
    // // B obj3 = new A();obj3.print();	
    //   A obj4 = new A();obj4.print();	
    //   B obj1 = new B();obj1.print();

    A obj2 = new B();obj2.print();	
A obj4 = new A();obj4.print();	
B obj1 = new B();obj1.print();	
// B obj3 = new A();obj3.print();


//     B obj1 = new B();	
// A obj4 = new A();	
// A obj2 = new B();	
// B obj3 = new A();
    }
}
