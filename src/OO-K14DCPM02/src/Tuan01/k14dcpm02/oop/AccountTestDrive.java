package Tuan01.k14dcpm02.oop;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account();
        account.show();
        account.deposit(500000);
        account.show();
        account.withdram(200000);
        account.show();
    } 
 }
