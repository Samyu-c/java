import java.util.Scanner;
public class Second_largest {
     int second (int arr[],int n)
    {
        int largest =arr[0];
        int secondLargest=-1;
        for (int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];

            }
            else if(arr[i]<largest && arr[i]>secondLargest)
            {
                secondLargest=arr[i];
            }

        }
        return secondLargest;

    }
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter size of array");
        int n=s.nextInt();
        int [] arr=new int[n];
        System.out.println("enter number:");
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Second_largest obj=new Second_largest();
        int result=obj.second(arr,n);
        System.out.println(" the second largest element in the array is : "+result);
    }
    
}
