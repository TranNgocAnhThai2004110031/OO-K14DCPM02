package Tuan03.Buoi6;

public class Cat extends Animal {
    @Override
    protected void makeNoise() {
        System.out.println("Cat suond meo meo");
    }

    @Override
    protected void eat() {
        System.out.println("Cat eating meat, fish, food..");
    }
    // bổ sung thêm
    public void chaseButterfly() {
        System.out.println("Chasing ... ");
    }
}
