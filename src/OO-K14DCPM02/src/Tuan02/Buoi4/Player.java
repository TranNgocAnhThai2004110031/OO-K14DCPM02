package Tuan02.Buoi4;

public class Player {
    private int number;

    public void guess(){
        this.number = (int) (Math.random() * 10);
    }

    public int getNumber() {
        return this.number;
    }
}
