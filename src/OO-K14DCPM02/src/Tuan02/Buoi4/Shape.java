package Tuan02.Buoi4;

public class Shape {
    private Square square =  new Square("Square.aif");
    private Circle circle = new Circle("Circle.aif");
    private Triangle triangle = new Triangle("Triangle.aif");
    private Amoeba amoeba = new Amoeba("Amoeba.hif");
    public void Click(String fileSound) {
        if (fileSound.equals("Square")) {
            square.roate();
            square.playSound();
        }
        if (fileSound.equals("Circle")) {
            circle.roate();
            circle.playSound();
        } 
        if (fileSound.equals("Triangle")) {
            triangle.roate();
            triangle.playSound();
        } else {
            amoeba.rotateAutoXY();
            amoeba.playSound();
        }
    }
}
