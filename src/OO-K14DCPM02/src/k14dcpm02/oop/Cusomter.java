package k14dcpm02.oop;

import java.util.Scanner;

public class Cusomter {
    // data
    static int age, phone;
    static String name, address;
    // operation
    // functions
    static Scanner sc = new Scanner(System.in);

    void inputCusomer(){
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone: ");
        phone = sc.nextInt();
    }

    void print(){
        System.out.println("\nThông tin khách hàng:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}
