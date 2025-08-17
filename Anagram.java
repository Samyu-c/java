import java.util.Scanner;
public class Anagram {
    public static boolean isanagram(String s1,String s2)
    {
        int count=0; 
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                    s2.replace(s2.charAt(j),'0');
                    
                }
            }
        }
        if(count==s1.length())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String[] args)
    {
        System.out.println("SAMYUKTHA.B 2024503581");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1:");
        String s1=sc.next();
        System.out.println("enter string2:");
        String s2=sc.next();
        if(isanagram(s1,s2))
        {
            System.out.println("the given strings are anagram");
        }
        else
        {
            System.out.println("the given strings are NOT anagram");   
        }
       

    }
    
}
