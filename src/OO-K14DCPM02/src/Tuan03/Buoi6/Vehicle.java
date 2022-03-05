package Tuan03.Buoi6;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thue;

    public Vehicle() {
        
    }

    public Vehicle(String tenChuXe, String loaiXe){
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia, double thue){
        this(tenChuXe,loaiXe);
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thue = thue;
    }

    public String getTen(){
        return this.tenChuXe;
    }
    public String getLoai(){
        return this.loaiXe;
    }
    public int getDungTich(){
        return this.dungTich;
    }
    public double getGia(){
        return this.triGia;
    }
    public double getThue(){
        return this.thue;
    }

    public void setTen(String ten) {
        this.tenChuXe = ten;
    }
    public void setLoai(String loai) {
        this.loaiXe = loai;
    }
    public void setDungTich(int dt) {
        this.dungTich = dt;
    }
    public void setGia(double gia) {
        this.triGia = gia;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên chủ xe: ");
        setTen(sc.nextLine());
        System.out.print("Nhập loại xe: ");
        setLoai(sc.nextLine());
        System.out.print("Nhập dung tích xe: ");
        setDungTich(sc.nextInt());
        System.out.print("Nhập trị giá xe: ");
        setGia(sc.nextDouble());
        thuePhaiNop();
    }

    private void thuePhaiNop() {
        if (dungTich <100) {
            thue = triGia/100;
        }
        if (100 <= dungTich && dungTich <= 200) {
            thue = (triGia*3)/100;
        } else {
            thue = (triGia*5)/100;
        }
    }

    public String toString() {
        String str = this.tenChuXe + "\t" + this.loaiXe + "\t" + this.dungTich + "\t\t" + this.triGia + "\t" + this.thue;
        return str;
    }

}
