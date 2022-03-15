package Tuan05.Buoi9.Bai3;

import java.text.ParseException;
import java.util.Date;

public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private String loaiTien;
    private double thanhTien;
    public GiaoDichTienTe() {
    }
    public GiaoDichTienTe(int maGD, Date ngayGD, double donGia, int soLuong, double tiGia, String loaiTien,
            double thanhTien) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTien = loaiTien;
        this.thanhTien = thanhTien;
    }
    public double getTiGia() {
        return tiGia;
    }
    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }
    public String getLoaiTien() {
        return loaiTien;
    }
    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }
    public double getThanhTien() {
        setThanhTien(thanhTien);
        return thanhTien;
    }
    public void setThanhTien(double thanhTien) {
        if (getLoaiTien().equals("Viet Nam")) {
            this.thanhTien = getSoLuong()*getDonGia();
        } else {
            this.thanhTien = getSoLuong()*getDonGia()*getTiGia();
        }
    }
    @Override
    protected void input() throws ParseException {
        super.input();
        System.out.print("- Nhập vào tỉ giá: ");
        tiGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("- Nhập vào loại tiền(Viet Nam, USD, Euro)");
        loaiTien = sc.nextLine();
    }
    @Override
    public String toString() {
        return super.toString() + String.format("%-20.2f%-20s%-20.2f", tiGia, loaiTien, getThanhTien());
    }

    
}
