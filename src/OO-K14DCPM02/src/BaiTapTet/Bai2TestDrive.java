package BaiTapTet;

public class Bai2TestDrive {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        sp1.input();

        SanPham sp2 = new SanPham();
        sp2.input();

        sp1.output();
        System.out.println("--------------------------");
        sp2.output();
    }
}
