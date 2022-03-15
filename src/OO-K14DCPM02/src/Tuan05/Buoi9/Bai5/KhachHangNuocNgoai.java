package Tuan05.Buoi9.Bai5;

import java.text.ParseException;
import java.util.Date;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;
    private double thanhTien;

    public KhachHangNuocNgoai() {
    }
    
    public KhachHangNuocNgoai(String maKH, String hoTen, Date ngayRaHD, float soLuong, double donGia, String quocTich,
            double thanhTien) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia);
        this.quocTich = quocTich;
        this.thanhTien = thanhTien;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
    public String getQuocTich() {
        return quocTich;
    }

    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = getSoLuong()*getDonGia();
    }
    @Override
    protected void input() throws ParseException {
        super.input();
        sc.nextLine();
        System.out.print("- Nhập vào quốc tịch: ");
        quocTich = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-20s%-20.2f", quocTich, getThanhTien());
    }
    
}
