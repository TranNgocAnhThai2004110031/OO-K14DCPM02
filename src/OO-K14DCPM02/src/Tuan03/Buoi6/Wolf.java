package Tuan03.Buoi6;

public class Wolf extends Animal {
    @Override
    protected void eat() {
        System.out.println("Wolf eating ... meat, fish, ... ");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Wolf sound ...");
    }
}
