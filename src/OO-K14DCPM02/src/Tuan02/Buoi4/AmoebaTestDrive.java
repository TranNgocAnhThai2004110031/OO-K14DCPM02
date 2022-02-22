package Tuan02.Buoi4;

public class AmoebaTestDrive {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("MusicSpringAmoeba.hif", 1.8, 3.1);
        amoeba.rotate();
        amoeba.playSound();

        Amoeba amoeba2 = new Amoeba("MusicSpringAmoeba.hif");
        amoeba2.rotateAutoXY();
        amoeba2.playSound();
    }
}
