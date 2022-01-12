package k14dcpm02.oop;

import java.util.Scanner;

public class Employee {
    // data
    int id, age, phone;
    String name, address, position;
    double salary;
    // operation
    // functions
    static Scanner sc = new Scanner(System.in);

    void inputEmployee(){
        System.out.print("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone: ");
        phone = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Position: ");
        position = sc.nextLine();       
    }

    void print(){
        System.out.println("\nThông tin nhân viên:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Position: " + position);
    }
}
