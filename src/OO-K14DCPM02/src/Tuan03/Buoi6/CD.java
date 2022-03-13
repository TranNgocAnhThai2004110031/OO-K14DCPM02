package Tuan03.Buoi6;

import java.util.Scanner;

public class CD {
    private int maCD;
    private String tuaCD;
    private String caSi;
    private int soBaiHat;
    private double giaThanh;

    Scanner n = new Scanner(System.in);

    public CD(){

    }
        
    public CD(int maCD, String tuaCD, String caSi, int soBaiHat, double giaThanh) {
        this.setMaCD(maCD);
        this.tuaCD = tuaCD;
        this.caSi = caSi;
        this.setSoBaiHat(soBaiHat);
        this.setGiaThanh(giaThanh);
    }

    public int getMaCD() {
        return maCD;
    }
    public void setMaCD(int macd) {
        if (macd == maCD) {
            System.out.println("Mã CD bị trùng vui lòng nhập lại!!!");
        }
        if (macd > 100) {
            System.out.println("Dung lượng bộ nhớ không đủ.");
        } else {
            this.maCD = macd;
        }
        return;
    }
    public String getTuaCD() {
        return tuaCD;
    }
    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public String getCaSi() {
        return caSi;
    }
    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }
    public void setSoBaiHat(int soBaiHat) {
        if (soBaiHat > 0) {
            this.soBaiHat = soBaiHat;
        } else {
            System.out.println("Số bài hát phải lớn hơn 0 !!!");
        }
    }
    public double getGiaThanh() {
        return giaThanh;
    }
    public void setGiaThanh(double giaThanh) {
        if (giaThanh > 0) {
            this.giaThanh = giaThanh;
        } else {
            System.out.println("Giá thành pjair lớn hơn 0 !!!");
        }
    }
    
    @Override
    public String toString(){
        String ctr = String.format("%-20d%-20s%-20s%-20d%-20f", maCD, tuaCD, caSi, soBaiHat, giaThanh);
        return ctr;
    }

    void nhapCD(){
        System.out.println("____________________________________");
        System.out.print("- Nhập mã CD: ");
        maCD = n.nextInt();
        n.nextLine();
        System.out.print("- Nhập tựa CD: ");
        tuaCD = n.nextLine();
        System.out.print("- Nhập tên ca sĩ: ");
        caSi = n.nextLine();
        System.out.print("- Nhập số bài hát: ");
        soBaiHat = n.nextInt();
        System.out.print("- Nhập giá thành: ");
        giaThanh = n.nextDouble();
    }
}
