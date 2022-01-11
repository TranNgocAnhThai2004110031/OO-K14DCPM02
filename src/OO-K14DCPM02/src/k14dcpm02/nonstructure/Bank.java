package k14dcpm02.nonstructure;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        // data - dữ liệu
        // các variables(biến)
        int accout_number = 12345; // id của tài khoản
        int accout_balance = 0; // số dư tài khoản

        Scanner input = new Scanner(System.in);
        // các thao tác operation lên data
        // gửi tiền
        System.out.print("Nhập số tiền gửi > ");
        int inputAmount = input.nextInt();
        accout_balance += inputAmount;

        // show
        System.out.println("Thông tin tài khoản:");
        System.out.println("Account number: " + accout_number);
        System.out.println("Account balance: " + accout_balance);

        // withdram - rút tiền
        System.out.print("Nhập số tiền rút > ");
        int inputWithdramAmount = input.nextInt();
        accout_balance -= inputWithdramAmount;

         // show
         System.out.println("Thông tin tài khoản:");
         System.out.println("Account number: " + accout_number);
         System.out.println("Account balance: " + accout_balance);

         // withdram - rút tiền
        System.out.print("Nhập số tiền rút > ");
        inputWithdramAmount = input.nextInt();
        accout_balance -= inputWithdramAmount;

         // show
         System.out.println("Thông tin tài khoản:");
         System.out.println("Account number: " + accout_number);
         System.out.println("Account balance: " + accout_balance);
    }
}

