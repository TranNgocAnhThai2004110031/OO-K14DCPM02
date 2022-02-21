package Tuan02.Buoi4;

public class GuessGame {
    private Player p1 = new Player();;
    private Player p2 = new Player();
    private Player p3 = new Player();
    private int guessp1;
    private int guessp2;
    private int guessp3;

    public void startGame() {
        playGame();
        return;
    }
    private void playGame(){
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Tôi đang nghĩ đến một số từ 0 -> 9: ....");

        while(true){
            System.out.println("Số guess là:  " +targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.getNumber();
            System.out.println("Người chơi thứ nhất đoán là:  " + guessp1);
            guessp2 = p2.getNumber();
            System.out.println("Người chơi thứ hai đoán là:  " + guessp2);
            guessp3 = p3.getNumber();
            System.out.println("Người chơi thứ ba đoán là:  " + guessp3);

            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            if(p1isRight == true || p2isRight == true || p3isRight == true){
                System.out.println("Chúng tôi đã có người chiến thắng!");
                System.out.println("Người chơi thứ nhất đã đoán: " + p1isRight);
                System.out.println("Người chơi thứ hai đã đoán: " + p2isRight);
                System.out.println("Người chơi thứ ba đã đoán: " + p3isRight);
                System.out.println("Cuộc chơi đã kết thúc");
                break;
            }
            else{
                System.out.println("Players will have to try again");
            }
        }
    } 
}
