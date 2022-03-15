package Tuan05.Buoi9.Bai3;

import java.text.ParseException;
import java.util.Date;

public class GiaoDichVang extends GiaoDich {
    private String loaiVang;
    
    private double thanhTien;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGD, Date ngayGD, double donGia, int soLuong, String loaiVang, double thanhTien) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
        this.setThanhTien(thanhTien);
    }

    public GiaoDichVang(int maGD, Date ngayGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang; 
    }
    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = getSoLuong() * getDonGia();
    }
    @Override
    protected void input() throws ParseException {
        super.input();
        sc.nextLine();
        System.out.print("- Nhập loại vàng: ");
        loaiVang = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-20s%-20.2f", loaiVang, getThanhTien());
    }
}
