package Tuan04.Buoi7.Bai1;

import java.util.Scanner;

public class ChuyenXe {
    private int maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;
    Scanner sc = new Scanner(System.in);

    public ChuyenXe(){

    }
    public ChuyenXe(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public int getMaSoChuyen() {
        return maSoChuyen;
    }
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }
    public String getSoXe() {
        return soXe;
    }
    public double getDoanhThu() {
        return doanhThu;
    }
    public void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap() {
        System.out.print(" - Nhập mã số chuyến: ");
        setMaSoChuyen(sc.nextInt());
        sc.nextLine();
        System.out.print(" - Nhập họ tên tài xế: ");
        setHoTenTaiXe(sc.nextLine());
        System.out.print(" - Nhập số xe: ");
        setSoXe(sc.nextLine());
        System.out.print(" - Nhập doanh thu: ");
        setDoanhThu(sc.nextDouble());
    }

    public String toString() {
        String str = "Mã số chuyến: " + maSoChuyen + "\nHọ tên tài xế: " + hoTenTaiXe + "\nSố xe: " + soXe + "\nDoanh thu: " + doanhThu;
        return str;
    }


}
