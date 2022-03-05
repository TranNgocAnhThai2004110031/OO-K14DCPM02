package Tuan03.Buoi6;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(2004110031, "Trần Ngọc Anh Thái", 8, 9);  
        SinhVien sv2 = new SinhVien(2004110017, "Trương Hoài Phong", 8, 9);
        
        SinhVien sv3 = new SinhVien();
        sv3.nhap();
        
        System.out.println("MSSV" + "\t\t" + "Họ và tên" + "\t\t" + "Điểm LT" + "\t\t" + "Điểm TH" + "\t\t" + "Điểm TB");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
