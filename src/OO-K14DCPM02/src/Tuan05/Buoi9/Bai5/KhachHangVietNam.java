package Tuan05.Buoi9.Bai5;

import java.text.ParseException;
import java.util.Date;

public class KhachHangVietNam extends KhachHang {
    private String doiTuongKH;
    private int dinhMuc;
    private double thanhTien;
    public KhachHangVietNam() {
    }
    public KhachHangVietNam(String maKH, String hoTen, Date ngayRaHD, float soLuong, double donGia, String doiTuongKH,
            int dinhMuc, double thanhTien) {
        super(maKH, hoTen, ngayRaHD, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
        this.setThanhTien(thanhTien);
    }
    public String getDoiTuongKH() {
        return doiTuongKH;
    }
    public void setDoiTuongKH(String doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }
    public int getDinhMuc() {
        return dinhMuc;
    }
    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }
    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        if (getSoLuong() <= getDinhMuc()) {
            this.thanhTien = getSoLuong()*getDonGia();
        } else {
            this.thanhTien = getSoLuong()*getDonGia()*dinhMuc + (getSoLuong()-dinhMuc)*getDonGia()*2.5;   
        }
    }
    @Override
    protected void input() throws ParseException {
        super.input();
        sc.nextLine();
        System.out.print("- Nhập vào đối tượng(sinh hoạt, kinh doanh, sản xuất): ");
        doiTuongKH = sc.nextLine();
        System.out.print("- Nhập vào định mức tiêu thụ điện: ");
        dinhMuc = sc.nextInt();
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-20s%-20d%-20.2f", doiTuongKH, dinhMuc, getThanhTien());
    }

    
    
}
