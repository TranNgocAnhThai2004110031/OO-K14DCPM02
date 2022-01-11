package k14dcpm02.oop;

public class CusomterTestDrive {
    public static void main(String[] args) {
        Cusomter cusomter = new Cusomter();

        cusomter.getName("Nguyễn Văn A");
        cusomter.getAddress("TP.HCM");
        cusomter.show();
        cusomter.getName("Nguyễn Văn B");
        cusomter.getAddress("Bình Dương");
        cusomter.show();
    }
}
