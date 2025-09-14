import java.util.Scanner;
public class Stringreverse {
    public static void main(String[] args)
    {
        System.out.println("2024503581 samyuktha.b");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter string:");
        String s= sc.nextLine();
        char[] s1=s.toCharArray();
        String reverse="";
        for(int i=s1.length-1;i>=0;i--)
        {
            reverse+=s1[i];
        }
        System.out.println("the reversed string is "+reverse);
    }

}
