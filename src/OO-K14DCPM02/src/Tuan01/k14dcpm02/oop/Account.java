package Tuan01.k14dcpm02.oop;

public class Account {
    // data
    int accout_number = 12345; 
    int accout_balance;
    // operation
    // functions
    void deposit(int amount){
        accout_balance += amount;
    }

    void withdram(int amount){
        accout_balance -= amount;
    }

    void show(){
        System.out.println("\nThông tin tài khoản:");
        System.out.println("Account number: " + accout_number);
        System.out.println("Account balance: " + accout_balance);
    }
}
