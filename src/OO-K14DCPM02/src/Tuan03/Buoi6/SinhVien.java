package Tuan03.Buoi6;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String hoVaTen;
    private float diemLT, diemTH;

    public SinhVien() {

    }

    public SinhVien(int mssv, String hoVaTen) {
        this.mssv = mssv;
        this.hoVaTen = hoVaTen;
    }

    public SinhVien(int mssv, String hoVaTen, float diemLT, float diemTH) {
        this(mssv, hoVaTen);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMssv() {
        return this.mssv;
    } 

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    } 

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public float getDiemLT() {
        return this.diemLT;
    } 

    public void setDiemLT(float diemlt) {
        this.diemLT = diemlt;
    }

    public float getDiemTH() {
        return this.diemTH;
    } 

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTB() {
        float diemTB = (this.diemLT + this.diemTH) / 2;
        return diemTB;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mssv: ");
        setMssv(sc.nextInt());
        System.out.print("Nhập họ và tên: ");
        sc.nextLine();
        setHoVaTen(sc.nextLine());
        System.out.print("Nhập điểm LT: ");
        setDiemLT(sc.nextFloat());
        System.out.print("Nhập điểm TH: ");
        setDiemTH(sc.nextFloat());
    }

    public String toString() {
        String str = this.mssv +"\t" + this.hoVaTen+"\t" + this.diemLT+"\t\t" + this.diemTH + "\t\t" +diemTB();
        return str;
    }
   
}
