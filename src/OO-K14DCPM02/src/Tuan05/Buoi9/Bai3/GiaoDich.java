package Tuan05.Buoi9.Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich {
    private int maGD;
    private Date ngayGD;
    private double donGia;
    private int soLuong;

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public GiaoDich() {
    }
    public GiaoDich(int maGD, Date ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public int getMaGD() {
        return maGD;
    }
    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }
    public Date getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    protected void input() throws ParseException{
        System.out.print("- Nhập vào mã giao dịch: ");
        maGD = sc.nextInt();
        sc.nextLine();
        System.out.print("- Nhập vào ngày giao dịch: ");
        ngayGD = simpleDateFormat.parse(sc.nextLine());
        System.out.print("- Nhập vào đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("- Nhập vào số lượng: ");
        soLuong = sc.nextInt();
    }

    @Override
    public String toString() {
        String str = String.format("%-20d%-20s%-20.2f%-20d", maGD, simpleDateFormat.format(ngayGD), donGia, soLuong);
        return str;
    }
}
