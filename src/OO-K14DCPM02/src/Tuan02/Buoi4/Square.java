package Tuan02.Buoi4;

public class Square {
    private String fileSound;

    public Square(String fileSound){
        this.fileSound = fileSound;
    }

    public void roate(){
        System.out.println("Square roating 360");
    }

    public void playSound(){
        System.out.println("Play file music: " + this.fileSound);
    }
}
