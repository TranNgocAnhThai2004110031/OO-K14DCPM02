package k14dcpm02.oop;

import java.util.Scanner;

public class Employee {
    // data
    String name;
    double salary;
    // operation
    // functions
    Scanner sc = new Scanner(System.in);
    void getSalary(){
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    void getName(){
        System.out.print("Name: ");
        name = sc.nextLine();
    }    

    // show
    void show(){
        System.out.println("\nThông tin nhân viên:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
