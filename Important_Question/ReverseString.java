package Important_Question;

public class ReverseString {

    public static void IretitiveWay(String str)
    {
        StringBuilder rev= new StringBuilder();

        for(int i=str.length()-1;i>=0;i--)
        {
            rev.append(str.charAt(i));
        }

        System.out.println(rev);
    }

    public static String RecurisiveWay(String str){

        if(str.length()<2)
        {
            return str;
        }

        return RecurisiveWay(str.substring(1))+str.charAt(0);
    }

    public static void reverse(char[] str, int index,int n){

        if(index==n){

            return;
        }

        char bag= str[index];
        reverse(str, index+1, n);
        System.out.print(bag);
    }

    public static void main(String[] args) {
        String str= "poonam";

        System.out.println(str.substring(2));

        IretitiveWay(str);

        String revs= new StringBuilder(str).reverse().toString();
        System.out.println(revs);

        System.out.println(RecurisiveWay(str));

        String str1="ankitpoonam";
        char[] str3= str1.toCharArray();

        int n= str3.length;
        reverse(str3, 0, n);
    }
    
}
