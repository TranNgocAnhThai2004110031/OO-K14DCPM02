package Tuan01.k14dcpm02.oop;

public class XoayHinhTestDrive {
    public static void main(String[] args) {
        System.out.println("----Menu shape ----");    
        System.out.println(" 1 - Square shape");    
        System.out.println(" 2 - Circle shape");    
        System.out.println(" 3 - Triangle shape");    

        XoayHinh square = new XoayHinh("Square");
        square.nhapChuot();
        square.xoayHinh360TheoChieuKimDongHo();
        square.playTapTinAmThanh();

        XoayHinh circle = new XoayHinh("Circle");
        circle.nhapChuot();
        circle.xoayHinh360TheoChieuKimDongHo();
        circle.playTapTinAmThanh();

        XoayHinh triangle = new XoayHinh("Triangle");
        triangle.nhapChuot();
        triangle.xoayHinh360TheoChieuKimDongHo();
        triangle.playTapTinAmThanh();
    }
}
