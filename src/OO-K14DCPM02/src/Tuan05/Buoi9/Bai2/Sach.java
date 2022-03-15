package Tuan05.Buoi9.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }
    public Date getNgayNhap() {
        return ngayNhap;
    }
    public double getDonGia() {
        return donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    protected void input() throws ParseException {
        System.out.print("- Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("- Nhập ngày nhập sách: ");
        ngayNhap = simpleDateFormat.parse(sc.nextLine());
        System.out.print("- Nhập giá sách: ");
        donGia = sc.nextDouble();
        System.out.print("- Nhập số lượng: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        System.out.print("- Nhập tên nhà xuất bản: ");
        nhaXuatBan = sc.nextLine();
    }

    @Override
    public String toString() {
        String str = String.format("%-20s%-20s%-20f%-10d%-30s", maSach, simpleDateFormat.format(ngayNhap), donGia, soLuong, nhaXuatBan);
        return str;
    }

}
