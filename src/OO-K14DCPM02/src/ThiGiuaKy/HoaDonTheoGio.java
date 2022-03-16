package ThiGiuaKy;

import java.text.ParseException;
import java.util.Date;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;
    private double thanhTien;

    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(int maHD, Date ngayHD, String tenKh, int maPhong, double donGia, int soGioThue,
            double thanhTien) {
        super(maHD, ngayHD, tenKh, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.setThanhTien(thanhTien);
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        if (this.soGioThue <= 24) {
            this.thanhTien = getDonGia()*soGioThue;
        }
        if (this.soGioThue > 24 && this.soGioThue < 30) {
            this.thanhTien = getDonGia()*24;
        } 
        if (this.soGioThue > 30) {
            System.out.println("Số giờ đã trên 30 giờ nên không thể tính theo loại hoá giờ!!!");
        }
    }

    @Override
    protected void input() throws ParseException {
        super.input();
        System.out.print("- Nhập vào số giờ thuê: ");
        this.soGioThue = scs.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-20d%-20.2f", soGioThue, getThanhTien());
    }  
}
