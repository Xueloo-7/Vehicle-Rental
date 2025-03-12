import models.*;
import func.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // Vehicle 用空的构造函数做出来的车 = new Vehicle();
        // System.out.println("用空的构造函数做出来的车: "+用空的构造函数做出来的车.getID());

        // 用空的构造函数做出来的车.setID("100000");
        // System.out.println("用空的构造函数做出来的车: "+用空的构造函数做出来的车.getID());

        // Vehicle 用ID构造函数做出来的车 = new Vehicle("1001", "toyota");
        // System.out.println("用ID构造函数做出来的车: "+用ID构造函数做出来的车.getID() + "  "+ 用ID构造函数做出来的车.getBrand());
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();


        System.out.println("Enter your username: ");
        customer.setName(scanner.nextLine());;

        Input.test();


        scanner.close();
    }
}