package Tuan04.Buoi7.Bai1;

public class NoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDiDuoc;

    public NoiThanh(){

    }

    NoiThanh(int maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKmDiDuoc){
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public NoiThanh(int soTuyen, double soKmDiDuoc){
        super();
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print(" - Nhập số tuyến: ");
        this.soTuyen = sc.nextInt();
        System.out.print(" - Nhập số Km đi dược: ");
        this.soKmDiDuoc = sc.nextDouble();
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nSố tuyến: " + soTuyen + "\nSố Km đi được: " + soKmDiDuoc;
        
    }

    
}
