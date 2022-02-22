package Tuan02.Buoi4;

public class Amoeba {
    private String fileSound;
    private double xPoint;
    private double yPoint;

    public Amoeba(String fileSound){
        this.fileSound = fileSound;
    }

    public Amoeba(String fileSound, double xPoint, double yPoint){
        this(fileSound);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public void playSound(){
        System.out.println("Play file music: " + this.fileSound);
    }
    // X,Y duoc nhap tu ban phim
    public void rotate(){
        System.out.println("Amoeba rotating 360 at xPoint " + this.xPoint + " yPoint " + this.yPoint);
    }
    // X,Y ngau nhien va lam tron 1 so thap phan
    public void rotateAutoXY(){
        this.xPoint = Math.round((Math.random() * 10)*10.0)/ (10.0);
        this.yPoint = Math.round((Math.random() * 10)*10.0)/ (10.0);
        System.out.println("Amoeba rotating 360 at xPoint " + this.xPoint + " yPoint " + this.yPoint);
    }
    // X,Y ngau nhien va lam tron 2 so thap phan
    public void rotateAutoXY2(){
        this.xPoint = Math.round((Math.random() * 10)*100.0)/ (100.0);
        this.yPoint = Math.round((Math.random() * 10)*100.0)/ (100.0);
        System.out.println("Amoeba rotating 360 at xPoint " + this.xPoint + " yPoint " + this.yPoint);
    }
}
