package Tuan01.k14dcpm02.structured;

import java.util.Scanner;

public class BankStructured {
    static int accout_number = 12345; // id của tài khoản
    static int accout_balance = 0; // số dư tài khoản

    public static void main(String[] args) {
        // data - dữ liệu
        // các variables(biến)

        Scanner input = new Scanner(System.in);
        // các thao tác operation lên data
        // gửi tiền
        System.out.print("Nhập số tiền gửi > ");
        int inputAmount = input.nextInt();
        accout_balance += inputAmount;
        // thực hiện các lời gọi hàm - function call
        show();

        // withdram - rút tiền
        System.out.print("Nhập số tiền rút > ");
        int inputWithdramAmount = input.nextInt();
        accout_balance -= inputWithdramAmount;
        show();
         
        // withdram - rút tiền
        System.out.print("Nhập số tiền rút > ");
        inputWithdramAmount = input.nextInt();
        accout_balance -= inputWithdramAmount;
        show();
    }

    static void show(){        
        System.out.println("Thông tin tài khoản:");
        System.out.println("Account number: " + accout_number);
        System.out.println("Account balance: " + accout_balance);
    }
    
    // static void xyz(){
    //     accout_balance = 0;
    // }
    void deposit(){

    }

    void withdram(){
        
    }
}
