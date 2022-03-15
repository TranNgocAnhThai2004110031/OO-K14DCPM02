package Tuan05.Buoi9.Bai2;

import java.text.ParseException;
import java.util.Date;

public class SachThamKhao extends Sach{
    private double thue;
    private double thanhTien;
    public SachThamKhao() {
    }
    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue,
            double thanhTien) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
        this.setThanhTien(thanhTien);
    }
    public double getThue() {
        return thue;
    }
    public void setThue(double thue) {
        this.thue = thue;
    }
    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        this.thanhTien = getSoLuong() * getDonGia() + thue;
    }
    @Override
    protected void input() throws ParseException {
        super.input();
        System.out.print("- Nhập thuế: ");
        thue = sc.nextDouble();
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-20f%-20f", thue, getThanhTien());
    }


    
}
