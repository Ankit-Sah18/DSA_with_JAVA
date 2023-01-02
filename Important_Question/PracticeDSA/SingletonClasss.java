package Important_Question.PracticeDSA;

public class SingletonClasss {

    public static SingletonClasss singletoncInstance=null;

    public String s;

    private SingletonClasss()
    {
        s="This is singleton class";
    }

    public static SingletonClasss getInstance()
    {
        if(singletoncInstance==null)
        {
            singletoncInstance = new SingletonClasss();
        }

        return singletoncInstance;
    }

    public static void main(String[] args) {
        
          SingletonClasss x= SingletonClasss.getInstance();
          SingletonClasss y= SingletonClasss.getInstance();
          SingletonClasss z= SingletonClasss.getInstance();

          if(x==y && y==z)
          {
            System.out.println(x.hashCode()+"=="+x.s);
            System.out.println(y.hashCode());
            System.out.println(z.hashCode());
          }
          else
          {
            System.out.println("Its not a Singleton class...");
          }
    }
    
}
