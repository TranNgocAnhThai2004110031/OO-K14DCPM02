package Tuan01.k14dcpm02.oop;

public class Cow {
    String mauLong, giong;
    double canNang;
    boolean gioiTinh = true;

    public Cow(String mauLong, double canNang, String giong, Boolean gioiTinh){
        this.mauLong = mauLong;
        this.canNang = canNang;
        this.giong = giong;
        this.gioiTinh = gioiTinh;
    }

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

    void uong(){
        System.out.println("Uống ...");
    }
    void ngu(){
        System.out.println("Ngủ ...");
    }

    void print(){
        System.out.println("\nThông tin cow:");
        System.out.println("Color: " + mauLong);
        System.out.println("Uweight: " + canNang);
        System.out.println("Giống: " + giong);
        if (gioiTinh == true) {
            System.out.println("Giới tính: Đực");
        } else {
            System.out.println("Giới tính: Cái");
        }
        
    }
}
