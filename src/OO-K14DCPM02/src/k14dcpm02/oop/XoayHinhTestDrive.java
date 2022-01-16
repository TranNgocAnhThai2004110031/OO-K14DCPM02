package k14dcpm02.oop;

public class XoayHinhTestDrive {
    public static void main(String[] args) {
        XoayHinh square = new XoayHinh();
        square.nameShape = "square";
        square.nhapChuot();
        square.xoayHinh360TheoChieuKimDongHo();
        square.playTapTinAmThanh();

        XoayHinh circle = new XoayHinh();
        circle.nameShape = "circle";
        circle.nhapChuot();
        circle.xoayHinh360TheoChieuKimDongHo();
        circle.playTapTinAmThanh();

        XoayHinh triangle = new XoayHinh();
        triangle.nameShape = "triangle";
        triangle.nhapChuot();
        triangle.xoayHinh360TheoChieuKimDongHo();
        triangle.playTapTinAmThanh();
    }
}
