import java.util.Calendar;
import java.util.Scanner;
public class calendar {

    public static String getDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day); 

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        
        // Array to map Calendar days to strings
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
                          "THURSDAY", "FRIDAY", "SATURDAY" };

        return days[dayOfWeek - 1]; 
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter month (1-12):");
        int month = s.nextInt();
        System.out.println("enter day(1-7):");
        int day = s.nextInt();
        System.out.println("enter year:");
        int year = s.nextInt();
        System.out.println("the day is :"+getDay(month, day, year)); 
    }
}
