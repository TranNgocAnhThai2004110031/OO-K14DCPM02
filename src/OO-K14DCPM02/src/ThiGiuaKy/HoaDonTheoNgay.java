package ThiGiuaKy;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;
    private double thanhTien;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, int soNgayThue,
            double thanhTien) {
        super(maHD, ngayHD, tenKh, maPhong, donGia);
        this.soNgayThue = soNgayThue;
        this.setThanhTien(thanhTien);
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        if (this.soNgayThue > 7) {
            this.thanhTien = 7 * getDonGia() + (((soNgayThue - 7) * getDonGia() * 20 ) / 100);
        } else {
            this.thanhTien = soNgayThue*getDonGia();   
        }
    }

    @Override
    protected void input() throws ParseException {
        super.input();
        System.out.print("- Nhập vào số ngày thuê: ");
        this.soNgayThue = scs.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20d%-20.2f", soNgayThue, getThanhTien());
    }
    
}