package Tuan01.k14dcpm02.oop;

public class CowTestDrive {
    public static void main(String[] args) {

        Cow cow = new Cow("Trắng đen", 100, "Hà Lan", true);
        cow.print();
        cow.an();

        Cow cow2 = new Cow("Vàng", 110, "Hà lan", false);
        cow2.print();
        cow2.keu();

        Cow cow3 = new Cow("Trắng", 120, "Hà Lan", true);
        cow3.print();
        cow3.ngu();

        Cow cow4 = new Cow("Trắng vàng", 130, "Hà Lan", false);
        cow4.print();
        cow4.uong();
        
        }
}
