package Tuan05.Buoi9.Bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon;
        Scanner sc = new Scanner(System.in); 
        List<GiaoDichVang> list = new ArrayList<>();
        List<GiaoDichTienTe> list2 = new ArrayList<>();
        do {
            System.out.println("----------Menu----------");
            System.out.println(">>1. Nhập danh sách giao dịch vàng.");
            System.out.println(">>2. Nhập danh sách giao dịch tiền tệ.");
            System.out.println(">>3. Tổng số lượng cho từng loại.");
            System.out.println(">>4. Trung bình thành tiền của giao dịch tiền tệ.");
            System.out.println(">>5. Xuất danh sách giao dịch theo từng loại.");
            System.out.println(">>6. Xuất danh sách các giao dịch có đơn giá lớn hơn 1 tỷ.");
            System.out.println(">>7. thoát.");
            System.out.print("- Vui lòng nhập lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    while (true) {
                        GiaoDichVang giaoDichVang = new GiaoDichVang();
                        giaoDichVang.input();
                        list.add(giaoDichVang);
                        System.out.print("Thêm sách giáo khoa(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe();
                        giaoDichTienTe.input();
                        list2.add(giaoDichTienTe);
                        System.out.print("Thêm sách tham khảo(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 3:
                    double tongSLV = 0, tongSLTT = 0;
                    for (GiaoDichVang a : list) {
                       tongSLV += a.getSoLuong();
                    }
                    for (GiaoDichTienTe b : list2) {
                        tongSLTT += b.getSoLuong();
                    }
                    System.out.println("Tổng số lượng giao dịch vàng: " + tongSLV);
                    System.out.println("Tổng số lượng giao dịch tiền tệ: " + tongSLTT);
                    break;
                case 4:
                    double tong = 0, tb = 0;
                    int a = 0;
                    for (GiaoDichTienTe b : list2) {
                        a++;
                        tong += b.getThanhTien();
                    }
                    tb = tong/a;
                    System.out.println("Trung bình thành tiền của giao dịch tiền tệ: " + tb);
                    break;
                case 5:
                    System.out.println("-----Danh sách Giao dịch vàng-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá", "Số lượng", "Loại Vàng", "Thành tiền");
                    for (GiaoDichVang giaoDichVang : list) {
                        System.out.println(giaoDichVang.toString());
                    }
                    System.out.println("-----Danh sách giao dịch tiền tệ-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá", "Số lượng", "Tỉ giá", "Loại tiền tệ", "Thành tiền");
                    for (GiaoDichTienTe giaoDichTienTe : list2) {
                        System.out.println(giaoDichTienTe.toString());
                    }
                    break;
                case 6:
                    System.out.println("-----Danh sách giao dịch có đơn giá hơn 1 tỷ-----");
                    System.out.println("-----Danh sách Giao dịch vàng-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá", "Số lượng", "Loại Vàng", "Thành tiền");
                    for (GiaoDichVang giaoDichVang : list) {
                        if (giaoDichVang.getDonGia() > 1000000000) {
                            System.out.println(giaoDichVang.toString());
                        }
                    }
                    System.out.println("-----Danh sách giao dịch tiền tệ-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã giao dịch", "Ngày giao dịch", "Đơn giá", "Số lượng", "Tỉ giá", "Loại tiền tệ", "Thành tiền");
                    for (GiaoDichTienTe giaoDichTienTe : list2) {
                        if (giaoDichTienTe.getDonGia() > 1000000000) {
                            System.out.println(giaoDichTienTe.toString());
                        }
                    }
                    break;
                case 7:
                    return;
                default:
                    break;
            }
        } while (luaChon != 0);
    }
}
