import java.util.Scanner;
class Main
{ 
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string1");
       String string1=sc.next();
       System.out.println("enter string2");
       String string2=sc.next();

       if(string1.equals(string2))
       {
        System.out.println("both strings are same or equal");
       }
       else
       {
        System.out.println("both strings are not same or not equal");
       }

    }
}
