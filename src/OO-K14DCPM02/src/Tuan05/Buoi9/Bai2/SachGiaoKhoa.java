package Tuan05.Buoi9.Bai2;

import java.text.ParseException;
import java.util.Date;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang;
    
    private double thanhTien;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang,
            double thanhTien) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
        this.setThanhTien(thanhTien);
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void setThanhTien(double thanhTien) {
        if (tinhTrang == true) {
            this.thanhTien = getSoLuong() * getDonGia();
        } else {
            this.thanhTien = (getSoLuong() * getDonGia() * 50)/100;
        }
    }
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public double getThanhTien() {
        this.setThanhTien(thanhTien);
        return this.thanhTien;
    }

    @Override
    protected void input() throws ParseException {
        super.input();
        System.out.print("- Nhập tình trạng (true:mới/false:cũ): ");
        tinhTrang = sc.nextBoolean();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%210s%-20f", tinhTrang, getThanhTien());
    }

   

    
}
