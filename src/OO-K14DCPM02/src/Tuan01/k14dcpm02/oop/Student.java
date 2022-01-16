package Tuan01.k14dcpm02.oop;

import java.util.Scanner;

public class Student {
    // attributes : data
    // biến
    static String name, mssv, lop;
    static double age;

    // menthods : functions
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextDouble();
        sc.nextLine();
        System.out.print("Mssv: ");
        mssv = sc.nextLine();
        System.out.print("Lớp: ");
        lop = sc.nextLine();
    }

    void hoc(){
        System.out.println("Học ");
    }

    void doc(){
        System.out.println("Đọc ");
    }

    void thi(){
        System.out.println("Thi ");
    }

    void hoatDongNgoaiKhoa(){
        System.out.println("Hoạt động ngoại khoá ");
    }

    void print(){
        System.out.println("\nThông tin sinh viên:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mssv: " + mssv);
        System.out.println("Lớp: " + lop);
    }
}