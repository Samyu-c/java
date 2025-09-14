import java.util.Scanner;
public class compression
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String str=sc.next();
        char[] ch=str.toCharArray();
        int count=1;
        String word=" ";
        for(int i=0;i<ch.length;i++)
        {
            if(i+1<ch.length && ch[i]==ch[i+1])
            {
                count++;
            }
            else
            {
                word+=ch[i];
                word+=count;
                count=1;
            }
        }

        if(str.length()==word.length())
        {
            System.out.println(str);
        }
        else {
            System.out.println("compressed string: " + word);
        }
    }

}
