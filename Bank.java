import java.util.Scanner;
public class Bank {
    static int totalAccounts=0;
    int accountNumber;
    int balance;
    Bank(int accountNumber,int balance)

    {
        this.accountNumber=accountNumber;
        this.balance=balance;
        totalAccounts++;

    }
    public void deposit(int amount)
    {
        int depositAmount=amount;
        balance+=depositAmount;
    }
    public void display()
    {
        System.out.println("accountnumber:"+accountNumber);
        System.out.println("balance:"+balance);
    }


    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("SAMYUKTHA");
        System.out.println("2024503581");
        System.out.println("enter no of entries: ");
        int n=s.nextInt();
        for (int i=1;i<=n;i++) {
            System.out.println("user" + i);
            System.out.println("enter account number:");
            int accountNumber = s.nextInt();
            System.out.println("enter balance:");
            int balance = s.nextInt();

            Bank obj_i = new Bank(accountNumber, balance);
            System.out.println("enter amount to be deposited:");
            int amount = s.nextInt();
            obj_i.deposit(amount);
            obj_i.display();
        }
        System.out.println("total accounts :"+totalAccounts);

        }
    }




