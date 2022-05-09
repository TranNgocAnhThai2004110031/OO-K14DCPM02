package SE_K14DCPM02.BaiTapVeNha;

import java.util.Scanner;

public class UITerminal {
    private String prompt;
    private String command;

    // List<Account> accounts = new ArrayList<>();

    private Account accObj = new Account();

    Scanner sc = new Scanner(System.in);

    public void display_options() {
        accObj.accounts.write();
    }

    public void handle_command() {
        
    }

    public void handle_inputs() {
        
    }
    
    public void get_inputs() {
        
    }

    public void login_inputs() {
        System.out.print("User Name: ");
        String un = sc.nextLine();
        System.out.print("Password: ");
        int ps = sc.nextInt();
        sc.nextLine();
        accObj.login(un, ps);     
        accObj.check_loggedin();   
    }

    public void create_account_inputs() {
        System.out.print("User Name: ");
        String un = sc.nextLine();
        System.out.print("Password: ");
        int ps = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        for (Account account : accObj.accounts.memory) {
            if (un.equals(account.getUsername())) {
                System.out.println("Username đã được sử dụng trước đó.");
                System.out.println("Tạo tài khoản thất bại!!!.");
                return;
            } else if (email.equals(account.getEmail())) {
                System.out.println("Email đã được sử dụng trước đó.");
                System.out.println("Tạo tài khoản thất bại!!!.");
                return;
            }
        }
        accObj.create_account(un, ps, email);  
        System.out.println("Tạo tài khoản thành công.");
    }

    
}
