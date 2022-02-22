package Tuan02.Buoi4;

public class Circle {
    private String fileSound;

    public Circle(String fileSound){
        this.fileSound = fileSound;
    }

    public void roate(){
        System.out.println("Cirde roating 360");
    }

    public void playSound(){
        System.out.println("Play file music: " + this.fileSound);
    }
}
