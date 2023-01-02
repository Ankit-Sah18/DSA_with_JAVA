package Important_Question.PracticeDSA.NimashaTech;

import java.util.ArrayList;
import java.util.List;

public class A {
    protected void print(String s)
    {
        System.out.println(s+" Techonolgy");
    }

    static void print(Object s){

        System.out.println(s+" Technologies..");
    }
    
}

class B extends A{

    protected void print(String s)
    {
        System.out.println(s+" Techonolgy pvt ldt..");
    }

    static void print(Object s){

        System.out.println(s+"Technologies pvt ltd..");
    }

    public static void main(String[] args) {
        
        // A a= new A();
         A a= new B();
        // B a= new B();
        // a.print(new StringBuilder("Nimasha.."));
        a.print(new StringBuilder("Nimasha"));
    }
}

// class Name{

//     private final String name;
//     Name()
//     {
//        name= "Nimasha";
//     }

//     Name(String name)
//     {
//         this.name =name;
//     }

//     @Override
//     public boolean equals(Object o)
//     {
//         if(this == o) return true;
//         if(o==null || getClass()!=o.getClass()) return false;
//         Name name= (Name)o;

//         return name.name.equalsIgnoreCase(this.name);
//     }

//     public static void main(String[] args) {

           
        
//         System.out.println(name.equals("NIMESA"));
      
//          System.out.println(name == new Name("nimesa"));
//        System.out.println(name == new Name("Nimesa"));
//         System.out.println(name.equals(new Name("nimesa")));    
//     }


// }

// class Maltiplication{

//     static int x= 10;
//     static{
//         x+=10;
//     }

//     Maltiplication(int x)
//     {
//         x+=Maltiplication.x;
//         System.out.println(x* this.x);
//     }

//     public static void main(String[] args) {
        
//         List<String> s= new ArrayList<>();

//         s.add("one");
//         s.add("two");

//         s.forEach((n)-> System.out.println(n));
//     }
// }
