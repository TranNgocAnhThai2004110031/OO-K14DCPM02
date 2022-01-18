package Tuan01.k14dcpm02.oop;

public class XoayHinh {
    // attributes : data
    // biến
    String nameShape;
    int luaChon;
    
    // menthods : functions

    public XoayHinh(String nameShape){
        this.nameShape = nameShape;      
    }

    void nhapChuot(){
        System.out.println(" - Nhấp chuột vào shape: " + nameShape);
    }

    void xoayHinh360TheoChieuKimDongHo(){
        System.out.println(" - Xoay " + nameShape + " 360 độ theo chiều kim đồng hồ.");
    }

    void playTapTinAmThanh(){
        System.out.println(" - Play âm thanh " + nameShape + ".AIF");
    }
}
