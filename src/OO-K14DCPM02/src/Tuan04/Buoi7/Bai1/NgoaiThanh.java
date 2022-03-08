package Tuan04.Buoi7.Bai1;

public class NgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDihoc;

    public NgoaiThanh(){

    }

    public NgoaiThanh(String noiDen, int soNgayDihoc){
        super();
        this.noiDen = noiDen;
        this.soNgayDihoc = soNgayDihoc;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        sc.nextLine();
        System.out.print(" - Nhập nơi đến: ");
        this.noiDen = sc.nextLine();
        System.out.print(" - Nhập số ngày đi học: ");
        this.soNgayDihoc = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nNơi đến: " + noiDen + "\nSố ngày đi học: " + soNgayDihoc;
        
    }
}
