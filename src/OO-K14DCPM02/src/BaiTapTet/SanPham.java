package BaiTapTet;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;
    private double thueNhapKhau;
    private double Gia;

    public SanPham(){
    
    }

    public SanPham(String tenSp, double donGia, double giamGia){
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia){
        this(tenSp, donGia, 0);
    }

    //phương thức nhập data
    public String getTenSp(){
        return tenSp;
    }

    public void setTenSp(String tenSp){
        this.tenSp = tenSp;
    }

    public double getDonGia(){
        return donGia;
    }

    public void setDonGia(double donGia){
        this.donGia = donGia;
    }

    public double getGiamGia(){
        return giamGia;
    }

    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }

    public void getThueNhapKhau(double thueNhapKhau){
        thueNhapKhau = 10 * donGia /100;
        System.out.println("   Thuế nhập khẩu: " + thueNhapKhau);
    }
    //giá 
    public void getGia(double Gia){
        Gia = donGia - giamGia;
        System.out.println("=> Giá: " + Gia);
    }
    //nhập
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Tên sản phẩm: ");
        setTenSp(sc.nextLine());
        System.out.print(" Đơn giá: ");
        setDonGia(sc.nextDouble());
        System.out.print(" Giảm giá: ");
        setGiamGia(sc.nextDouble());
    }
    //xuất 
    public void output(){
        System.out.println("----------------------------");
        System.out.println("   Tên sản phẩm: " + getTenSp() + "\n   Đơn giá: " + getDonGia() + "\n   Giảm giá: " + getGiamGia());
        getThueNhapKhau(thueNhapKhau);
        getGia(Gia);
    }
}
