package Tuan01.k14dcpm02.oop;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 10;
        Dog two = new Dog();
        two.size = 20;

        one.bark();
        one.setBigger();
        one.run();

        two.bark();
        two.setBigger();
        two.run();
    }
}
