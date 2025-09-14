import java.util.Scanner;
public class Countword
{
    public static void main(String[] args)
    {
        System.out.println("SAMYUKTHA 2024503581");
        Scanner s=new Scanner (System.in);
        System.out.println("enter sentence:");
        String str=s.nextLine();
        String [] str1=str.split(" ");
        int count=str1.length;
        System.out.println("the no of words in the given string is:  "+count);

    }

}
