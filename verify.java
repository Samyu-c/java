
import java.util.Scanner;

public class verify {
    
    public static boolean isValidEmail(String email) {
        // Check for exactly one '@'
        int atCount = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atCount++;
            }
        }
        if (atCount != 1) {
            return false;
        }
        
        
        int atIndex = email.indexOf('@');
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        
        if (username.length() > 25) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!(Character.isLetterOrDigit(ch) || ch == '_' || ch == '-' || ch == '+')) {
                return false;
            }
        }
        
       
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            return false;
        }
        
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("SAMYUKTHA.B 2024503581");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.next();
        
        if (isValidEmail(email)) {
            int atIndex = email.indexOf('@');
            System.out.println("Valid email ");
            System.out.println("Username: " + email.substring(0, atIndex));
            System.out.println("Domain: " + email.substring(atIndex + 1));
        } else {
            System.out.println("Invalid email ❌");
        }
    }
}
