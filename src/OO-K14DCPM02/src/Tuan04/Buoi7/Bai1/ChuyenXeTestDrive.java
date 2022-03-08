package Tuan04.Buoi7.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        ArrayList<NoiThanh> arrNoiThanh = new ArrayList<>();
		ArrayList<NgoaiThanh> arrNgoaiThanh = new ArrayList<>();
		int soChuyenNoiThanh, soChuyenNgoaiThanh;
		double doanhThuXeNoiThanh = 0, doanhThuXeNgoaiThanh = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" - Nhập số chuyến xe nội thành: ");
		soChuyenNoiThanh = scanner.nextInt();
		System.out.print(" - Nhập số chuyến xe ngoại thành: ");
		soChuyenNgoaiThanh = scanner.nextInt();
		
		System.out.println("Nhập thông tin chuyến xe nội thành:");
		for (int i = 0; i < soChuyenNoiThanh; i++) {
			System.out.printf("Nhập thông tin chuyến xe thứ %d: \n", (i + 1));
			NoiThanh noiThanh = new NoiThanh();
			noiThanh.nhap();
			doanhThuXeNoiThanh += noiThanh.getDoanhThu();
			arrNoiThanh.add(noiThanh);
		}
		
		System.out.println("Nhập thông tin chuyến xe ngoại thành:");
		for (int i = 0; i < soChuyenNgoaiThanh; i++) {
			System.out.printf("Nhập thông tin chuyến xe thứ %d: \n", (i + 1));
			NgoaiThanh ngoaiThanh = new NgoaiThanh();
			ngoaiThanh.nhap();
			doanhThuXeNgoaiThanh += ngoaiThanh.getDoanhThu();
			arrNgoaiThanh.add(ngoaiThanh);
		}
		
		System.out.println("----------Thông tin chuyến xe nội thành----------");
		for (int i = 0; i < arrNoiThanh.size(); i++) {
			System.out.println(arrNoiThanh.get(i).toString());
		}
		
		System.out.println("----------Thông tin chuyến xe ngoại thành----------");
		for (int i = 0; i < arrNgoaiThanh.size(); i++) {
			System.out.println(arrNgoaiThanh.get(i).toString());
		}
		
		System.out.println("----------Doanh thu từng chuyến xe----------");
		System.out.println("Doanh thu chuyến xe nội thành: " + doanhThuXeNoiThanh);
		System.out.println("Doanh thu chuyến xe ngoại thành: " + doanhThuXeNgoaiThanh);
	}
}
