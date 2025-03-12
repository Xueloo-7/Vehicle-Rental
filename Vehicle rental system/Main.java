import models.*;
import func.*;

import static func.Input.nextLine;
import static func.Input.println;

class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setName(Input.getValidUsername());

        customer.setEmail(Input.getValidEmail()); 

        customer.setPhoneNumber(Input.getValidPhoneNumber());

        println("\nYour information:");
        println("Username: " + customer.getName());
        println("Email: " + customer.getEmail());
        println("Phone: " + customer.getPhoneNumber());

        println("\nConfirm to register? Yes/No");
        if(Input.getYesOrNot())
        {
            println("\nRegister Successfully! press ENTER go to Home Page!");
            nextLine();
        }
    }
}
