import java.util.Scanner;
public class Comparison 

{
    public static void main(String[] args)
    {
    System.out.println("SAMYUKTHA 2024503581 ");
    Scanner sc=new Scanner (System.in);
    System.out.println("enter string 1:");
    String s1=sc.next();
    System.out.println("enter string 2:");
    String s2=sc.next();
    String[] x=s1.split("\\.");
    String[] y=s2.split("\\.");

    for (int i=0;i<x.length;i++)
    {
        int num1=Integer.valueOf(x[i]);
        int num2=Integer.valueOf(y[i]);

        if(num1>num2)
        {
            System.out.println(" s1 is greater");
            break;
        }
        else if(num2>num1)
        {
            System.out.println(" s2 is greater");
            break;

        }
        else if(num1==num2)
        {
            continue;
        }
        else
        {
            System.out.println("both the strings are same");
        }
    
        

        
    }


    
}
}
