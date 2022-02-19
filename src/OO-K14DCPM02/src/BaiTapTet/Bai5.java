package BaiTapTet;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    private ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sản phẩm: ");
        n = sc.nextInt();

        SanPham sp = new SanPham();

        while (true) {
            for (int i = 0; i < n; i++) {
                list.add(sp = new SanPham());
                sp.input();
            }
            if(sc.nextLine().isEmpty()){ 
                break; 
            } 
        }
        
    }

    public void xuat() {
        for(SanPham sanPham : list){
            System.out.println("Thông tin sản phẩm" );
            sanPham.output();
        } 
        
    }
}
