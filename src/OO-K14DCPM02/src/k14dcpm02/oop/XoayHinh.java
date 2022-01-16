package k14dcpm02.oop;

public class XoayHinh {
    // attributes : data
    // biến
    static String nameShape;
    
    // menthods : functions
    void nhapChuot(){
        System.out.println(" - Nhấp chuột ");
    }

    void xoayHinh360TheoChieuKimDongHo(){
        System.out.println(" - Xoay " + nameShape + " 360 độ theo chiều kim đồng hồ.");
    }

    void playTapTinAmThanh(){
        System.out.println(" - Play âm thanh " + nameShape + ".AIF");
    }
}
