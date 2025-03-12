package func;

public class Validation {


    public static boolean isValidEmail(String email) {
        if (email == null) {
            System.out.println("❌ Email cannot be null!");
            return false;
        }
    
        email = email.trim();
    
        // Improved regex for valid emails with domains
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    
        if (!email.matches(emailRegex)) {
            System.out.println("❌ Invalid email! Please enter a valid email format (e.g., user@example.com).");
            return false;
        }
    
        return true;
    }
    

    public static boolean isValidUsername(String username) {
        if (username == null) {
            System.out.println("❌ Username cannot be null!");
            return false;
        }
        username = username.trim();

        if (username.isEmpty()) {
            System.out.println("❌ Username cannot be empty!");
            return false;
        }
        if (username.length() > 25) {
            System.out.println("❌ Username too long! Must be 1-25 characters.");
            return false;
        }
        if (!username.matches("^[a-zA-Z0-9_]+$")) {
            System.out.println("❌ Invalid username! Only letters, numbers, and underscores (_) are allowed.");
            return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            System.out.println("❌ Phone number cannot be null!");
            return false;
        }
        phoneNumber = phoneNumber.trim();

        if (!phoneNumber.matches("^\\+?[0-9]{10,15}$")) {
            System.out.println("❌ Invalid phone number! Must be 10-15 digits and can start with '+'.");
            return false;
        }
        return true;
    }
}
