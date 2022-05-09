package SE_K14DCPM02.BaiTapVeNha;

public class Account {
    private String username;
    private int password;
    private String email;
    private boolean loggedin;

    public static StoredFiles accounts = new StoredFiles("data.json");

    public Account() {
    }

    public Account(String username, int password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void set_account(String un, int ps) {
        this.username = un;
        this.password = ps;
    }

    public void login(String un, int ps) {
        username = un;
        password = ps;
    }

    public void logout() {
        this.username = null;
        this.password = 0;
    }

    public void create_account(String un, int ps, String email) {
        this.username = un;
        this.password = ps;
        this.email = email;
        Account account = new Account(un, ps, email);
        accounts.update(account);
    }

    public void account_valid(String un, String email) {
        
    }

    public boolean check_loggedin() {
        login(username, password);
        for (Account account : accounts.memory) {
            if (account.getUsername().equals(username) && password == account.getPassword()) {
                System.out.println("Đăng nhập thành công.");
                loggedin = true;
            } else {
                System.out.println("Đăng nhập thất bại!!!!!");
                System.out.println("Bạn đã nhập sai username hoặc password.");
            }
        }
        
        return loggedin;
    }
}
