package Tuan03.Buoi6;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account kh1 = new Account(123456789, "Trần Ngọc Anh Thái", 500000);
        kh1.napTien(500000);
        kh1.rutTien(200000);
        System.out.println(kh1);
        kh1.daoHan();

        Account kh2 = new Account(13579, "Nguyễn Văn A");
        kh2.napTien(500000);
        kh2.rutTien(200000);
        System.out.println(kh2);
        kh2.daoHan();
    }
}
