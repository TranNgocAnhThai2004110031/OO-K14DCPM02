package Tuan03.Buoi6;

public class Lion extends Animal {
    
    @Override
    protected void eat() {
        System.out.println("Lion eating ... meat, fish, ... ");
    }

    @Override
    protected void makeNoise() {
        System.out.println("Lion sound ...");
    }
}
