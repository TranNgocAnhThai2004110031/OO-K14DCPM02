package Tuan03.Buoi6;

public class Tiger extends Animal {
    @Override
    protected void eat() {
        System.out.println("Tiger eating ... meat, fish, ... ");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Tiger sound ...");
    }
}
