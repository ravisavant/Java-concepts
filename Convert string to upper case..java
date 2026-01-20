import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name in lower case");
        String name=sc.next();
        String Upper=name.toUpperCase();                          //name.toUpperCase for Upper case // name.toLowerCase  for lower case
        System.out.println("upper case of your name "+Upper);
    }
}
