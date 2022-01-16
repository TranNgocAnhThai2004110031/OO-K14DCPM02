package Tuan01.k14dcpm02.oop;

public class Cow {
    static String mauLong, giong;
    static double canNang;
    static boolean gioiTinh;

    void getCow(String mauLong, double canNang, String giong, boolean gioiTinh){
        System.out.println("Color: " + mauLong);
        System.out.println("Uweight: " + canNang);
        System.out.println("Giống: " + giong);
        System.out.println("Giới tính: " + gioiTinh);
    }

    void an(){
        System.out.println("Ăn ...");
    }

    void keu(){
        System.out.println("Kêu ...");
    }
}
