package func;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;


    // Output
    public static void println(String message) {
        System.out.println(message);
    }

    public static void println(int number) {
        System.out.println(number);
    }

    public static void println(double number) {
        System.out.println(number);
    }

    public static void println(boolean value) {
        System.out.println(value);
    }

    public static void println(Object obj) {
        System.out.println(obj); // Handles all objects (String, Integer, etc.)
    }






    // Input Validation
    public static String getValidUsername(){
        String username;
        while (true) {
            System.out.print("\nEnter your username: ");
            username = nextLine();

            if(Validation.isValidUsername(username))
            {
                break;
            }
        }
        return username;
    }

    public static String getValidEmail(){
        String email;
        while (true) {
            System.out.print("\nEnter your email: ");
            email = nextLine();

            if(Validation.isValidEmail(email))
            {
                break;
            }
        }
        return email;
    }

    public static String getValidPhoneNumber(){
        String phoneNumber;
        while (true) {
            System.out.print("\nEnter your phone number: ");
            phoneNumber = nextLine();

            if(Validation.isValidPhoneNumber(phoneNumber))
            {
                break;
            }
        }
        return phoneNumber;
    }

    public static Boolean getYesOrNot(){
        String input;
        while (true) {
            input = nextLine();
            if(input.toLowerCase().equals("yes") || input.toLowerCase().equals("y")){
                return true;
            }
            else if(input.toLowerCase().equals("yes") || input.toLowerCase().equals("y")){
                return false;
            }
            else{
                System.out.println("❌ Invalid input! Please enter yes | y | no | n.");
            }
        }
    }






    // Get Input
    public static String nextLine() {
        return getScanner().nextLine();
    }

    public static String next() {
        return getScanner().next();
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
