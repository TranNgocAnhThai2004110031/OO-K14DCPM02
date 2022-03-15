package Tuan05.Buoi9.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class KhachHang {
    private String maKH;
    private String hoTen;
    private Date ngayRaHD;
    private float soLuong;
    private double donGia;
    
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, Date ngayRaHD, float soLuong, double donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHD = ngayRaHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(Date ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    protected void input() throws ParseException {
        System.out.print("- Nhập vào mã khách hàng: ");
        maKH = sc.nextLine();
        System.out.print("- Nhập vào họ tên khách hàng: ");
        hoTen = sc.nextLine();
        System.out.print("- Nhập vào ngày ra hoá đơn: ");
        ngayRaHD = simpleDateFormat.parse(sc.nextLine());
        System.out.print("- Nhập vào số lượng điện tiêu thụ: ");
        soLuong = sc.nextFloat();
        System.out.print("- Nhập vào đơn giá: ");
        donGia = sc.nextDouble();
    }
    @Override
    public String toString() {
        String str = String.format("%-20s%-20s%-20s%-20.2f%-20.2f", maKH, hoTen, simpleDateFormat.format(ngayRaHD), soLuong, donGia);
        return str;
    }
}
