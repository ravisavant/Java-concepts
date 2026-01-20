import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        int lenofthename=name.length();
        System.out.println("lentgh of your name  "+lenofthename);
    }
}
