package BaiTapTet;

public class Bai3TestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Rau", 10000, 1000);
        SanPham sp2 = new SanPham("Quả", 20000);

        sp1.output();
        sp2.output();
    }
}
