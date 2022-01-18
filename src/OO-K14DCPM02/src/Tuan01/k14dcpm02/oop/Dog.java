package Tuan01.k14dcpm02.oop;

public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!"); 
        }
    }

    void setBigger(){
        size += 5;
    }

    void run(){
        System.out.println("Running ...");
        this.bark();
    }
}
