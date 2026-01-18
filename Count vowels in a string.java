import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre senetnce");
        String name=sc.nextLine().toLowerCase();

        int totalvowelscount=0;

        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
               totalvowelscount++;
            }
        }
        System.out.println(totalvowelscount +" vowels are present in the sentence");
    }
        
}
