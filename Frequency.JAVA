import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) 
    {
        System.out.println("SAMYUKTHA.B 2023403581");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.next();

        char[] ch = s.toCharArray();
        boolean[]b=new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) 
        {
            if(b[i])
            {
                continue;
            }
            int count = 0;

            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    b[i]=false;
                    count++;
                }
            }
            System.out.println("no of time   " + ch[i] + "    occured is   : " + count);
        }

    }
}