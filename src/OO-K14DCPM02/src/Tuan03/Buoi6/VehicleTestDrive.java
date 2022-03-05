package Tuan03.Buoi6;

import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        VehicleTestDrive testDrive = new VehicleTestDrive();
        testDrive.menu();
    }

    public void menu() {
        Vehicle xe1 = new Vehicle();
        Vehicle xe2 = new Vehicle();
        Vehicle xe3 = new Vehicle();
        int luaChon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" 1. Nhập thông tin khai tiền thuế trước bạ.");
            System.out.println(" 2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println(" 3. Thoát.");
            System.out.print("Nhập lựa chọn: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1:
                    xe1.nhap();
                    xe2.nhap();
                    xe3.nhap();
                    break;
                case 2:
                    System.out.println("Tên chủ xe" + "\t\t" +"Loại xe"+ "\t" + "Dunh tích" + "\t" + "Trị giá" + "\t" + "Thuế phải nộp");
                    System.out.println("===========================================================================================================");
                    System.out.println(xe1);
                    System.out.println(xe2);
                    System.out.println(xe3);
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        } while (luaChon != 0);
        
        
    }
}
