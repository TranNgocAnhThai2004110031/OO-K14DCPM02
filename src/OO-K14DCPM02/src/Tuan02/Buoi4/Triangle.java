package Tuan02.Buoi4;

public class Triangle {
    private String fileSound;

    public Triangle(String fileSound){
        this.fileSound = fileSound;
    }

    public void roate(){
        System.out.println("Triangle roating 360");
    }

    public void playSound(){
        System.out.println("Play file music: " + this.fileSound);
    }
}
