package Tuan04.Buoi8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {

    private String maHang;
    private String tenHang;
    private double donGia;
    private  Date ngaySX;
    private Date ngayHetHan;

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    }

    /**
     * @param maHang the maHang to set
     */
    private void setMaHang(String maHang) {
        if(maHang != null){
            this.maHang = maHang;
        }else{
            System.out.println("Ma Hang khong duoc rong !!!!");
        }
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println("Ten hang khong duoc rong !!!!");
        }
    }

    public void setDonGia(double gia) {
        if (donGia < 0) {
            System.out.println("Đơn giá phải lớn hơn 0!!!");
        } else {
            this.donGia = gia;
        }
        
    }

    public void setNgaySX(Date ngaySX) {
        if (ngaySX != null) {
            this.ngaySX = ngaySX;
        } else {
            System.out.println("Ngày sản xuất không được để rỗng");
        }
    }

    /**
     * @param ngayHetHan the ngayHetHan to set
     */
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(ngaySX)){
            this.ngayHetHan = ngayHetHan;
        }else{
            System.out.println("Ngay Het Han phai sau ngay Sx !!!");
        }
        
    }

    /**
     * @return the maHang
     */
    public String getMaHang() {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public double getDonGia() {
        return donGia;
    }
    public Date getNgaySX() {
        return ngaySX;
    }
    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {

        //09/03/2022 - dd/mm/yyyy
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");

        //kiem tra ngayHetHan ?null
        //ngaySX ???null

        return "HangThucPham [donGia=" + donGia + ", maHang=" + maHang + ", ngayHetHan=" + ngayVietNam.format(ngayHetHan) + ", ngaySX="
                + ngayVietNam.format(ngaySX) + ", tenHang=" + tenHang + "]";
    }

    /**
     * @param maHang
     * @param tenHang
     * @param donGia
     * @param ngaySX
     * @param ngayHetHan
     */
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHetHan) {

        this.setMaHang(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySX(ngaySX);
        this.setNgayHetHan(ngayHetHan);
    }

    public boolean kiemTraHSD(){//boolean
        boolean isHetHan = false;//con han
        Date ngayHienTai = new Date();

        if(this.ngayHetHan.before(ngayHienTai)){
            isHetHan = true;
        }

        return isHetHan;
    }
}
