package Tuan03.Buoi6;

public class HinhChuNhat {
    private double chieuDai = 0.0;
    private double chieuRong = 0.0;

    public double getChieuDai() {
        return this.chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return this.chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public String toString() {
        String str = "Chiều dài hình chữ nhật: " + this.chieuDai + "\nChiều rộng hình chữ nhật: " + this.chieuRong;
        str += "\nChu vi hình chữ nhật: " + chuVi() + "\nDiện tích hình chữ nhật: " + dienTich();
        return str;
    }
}
