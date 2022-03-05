package Tuan03.Buoi6;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;
    private double laiSuat = 0.035;

    public Account() {
        
    }

    public Account(long stk, String ttk, double st) {
        this.soTaiKhoan = stk;
        this.tenTaiKhoan = ttk;
        this.soTien = st;
    }

    public Account(long stk, String ttk) {
        this.soTaiKhoan = stk;
        this.tenTaiKhoan = ttk;
        this.soTien = 50;
    }

    public long getSoTaiKhoan() {
        return this.soTaiKhoan;
    }
    public void setSoTaiKhoan(long stk){
        this.soTaiKhoan = stk;
    }
    public String getTenTaiKhoan() {
        return this.tenTaiKhoan;
    }
    public void setTenTaiKhoan(String ttk) {
        this.tenTaiKhoan = ttk;
    }
    public double getSoTen() {
        return this.soTien;
    }
    public void setSoTien(double st) {
        this.soTien = st;
    }

    public void napTien(double tienNap) {
        if (tienNap > 0) {
            this.soTien += tienNap; 
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ vui lòng nhập lại!!!");
        }
    }

    public void rutTien(double tienRut) {
        if (tienRut <= soTien) {
            this.soTien -= tienRut;
        } else {
            System.out.println("Số tiền rút vào không hợp lệ vui lòng nhập lại!!!");
        }
    }

    public void daoHan() {
        double tienDaoHan;
        tienDaoHan = Math.round(((soTien + soTien)* laiSuat * 10)*100.0)/ (100.0);
        System.out.println("Số tiền đáo hạn: " + tienDaoHan);
    }

    public String toString() {
        String str = "Số tài khoản: " + this.soTaiKhoan + "\nTên chủ tài khoản: " + this.tenTaiKhoan + "\nSố tiền trong tài khoản: " + this.soTien;
        return str;
    }
}
