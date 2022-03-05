package Tuan03.Buoi6;

public class Dog extends Animal {
    public Dog(){

    }

    public Dog( String picture, String food, int hunger){
        
    }

    @Override
    protected void makeNoise() {
        System.out.println("Dog soud Guf Guf");
    }

    @Override
    protected void eat() {
        System.out.println("Dog eating mat, food....");
    }
    // bổ sung thêm
    public void chaseCats() {
        System.out.println("Chasing cats... ");
    }
}
