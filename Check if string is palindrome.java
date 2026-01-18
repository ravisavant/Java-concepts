import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre a word");
        String word=sc.next();
        String reverse="";

        for(int i=word.length()-1;i>=0;i--)
        {
           reverse=reverse+word.charAt(i);
        }
        if(word.equals(reverse))
        {
            System.out.println("the entered word is Plaindrome");
        }
        else
        {
             System.out.println("the entered word is NOt Plaindrome");

        }
    }
}
