/*
* created date: Mar 22, 2022
* author: cgm
*/
package SuaBaiThiGiuaKy;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public HoaDonTheoNgay() {
    }

    /**
     * @param maHD
     * @param ngayHD
     * @param tenKh
     * @param maPhong
     * @param donGia
     * @param thanhTien
     * @param soNgayThue
     */
    public HoaDonTheoNgay(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, double thanhTien,
            int soNgayThue) {
        super(maHD, ngayHD, tenKh, maPhong, donGia, thanhTien);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
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

    @Override
    protected void setThanhTien(double thanhTien) {
        if (this.soNgayThue > 7) {
            this.thanhTien = 7 * getDonGia() + (((soNgayThue - 7) * getDonGia() * 20 ) / 100);
        } else {
            this.thanhTien = soNgayThue*getDonGia();   
        }
        return;
    }

    @Override
    protected double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }
}
