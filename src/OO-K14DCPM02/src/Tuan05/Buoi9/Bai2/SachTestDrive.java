package Tuan05.Buoi9.Bai2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon;
        Scanner sc = new Scanner(System.in); 
        List<SachGiaoKhoa> list = new ArrayList<>();
        List<SachThamKhao> list2 = new ArrayList<>();
        do {
            System.out.println("----------Menu----------");
            System.out.println(">>1. Nhập danh sách sách giáo khoa.");
            System.out.println(">>2. Nhập danh sách sách tham khảo.");
            System.out.println(">>3. Tổng thành tiền.");
            System.out.println(">>4. Trung bình cộng đơn giá của sách tham khảo.");
            System.out.println(">>5. Xuất danh sách theo từng loại.");
            System.out.println(">>6. Xuất danh sách theo nhà sản xuất.");
            System.out.println(">>7. thoát.");
            System.out.print("- Vui lòng nhập lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    while (true) {
                        SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
                        sachGiaoKhoa.input();
                        list.add(sachGiaoKhoa);
                        System.out.print("Thêm sách giáo khoa(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        SachThamKhao sachThamKhao = new SachThamKhao();
                        sachThamKhao.input();
                        list2.add(sachThamKhao);
                        System.out.print("Thêm sách tham khảo(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 3:
                    double tongSGK = 0, tongSTK = 0;
                    for (SachGiaoKhoa a : list) {
                       tongSGK += a.getThanhTien();
                    }
                    for (SachThamKhao b : list2) {
                        tongSTK += b.getThanhTien();
                    }
                    System.out.println("Tổng thành tiền sách giáo khoa: " + tongSGK);
                    System.out.println("Tổng thành tiền sách tham khảo: " + tongSTK);
                    break;
                case 4:
                    double tong = 0, tb = 0;
                    int a = 0;
                    for (SachThamKhao b : list2) {
                        a++;
                        tong += b.getDonGia();
                    }
                    tb = tong/a;
                    System.out.println("Trung bình cộng đơn giá của sách tham khảo: " + tb);
                    break;
                case 5:
                    System.out.println("-----Danh sách sách giáo khoa-----");
                    System.out.printf("%-20s%-20s%-20s%-10s%-30s%-20s%-20s\n", "Mã sách", "Ngày nhập", "Đơn giá", "Số lượng", "Nhà sản xuất", "Tình trạng", "Thành tiền");
                    for (SachGiaoKhoa sachGiaoKhoa : list) {
                        System.out.println(sachGiaoKhoa.toString());
                    }
                    System.out.println("-----Danh sách sách tham khảo-----");
                    System.out.printf("%-20s%-20s%-20s%-10s%-30s%-20s%-20s\n", "Mã sách", "Ngày nhập", "Đơn giá", "Số lượng", "Nhà sản xuất", "Thuế", "Thành tiền");
                    for (SachThamKhao sachThamKhao : list2) {
                        System.out.println(sachThamKhao.toString());
                    }
                    break;
                case 6:
                    System.out.print("- Nhập vào tên nhà xuất bản bạn muốn tìm: ");
                    sc.nextLine();
                    String ten = sc.nextLine();
                    System.out.println("-----Danh sách theo nhà xuất bản-----");
                    System.out.println("-----Danh sách sách giáo khoa-----");
                    System.out.printf("%-20s%-20s%-20s%-10s%-30s%-20s%-20s\n", "Mã sách", "Ngày nhập", "Đơn giá", "Số lượng", "Nhà xuất bản", "Tình trạng", "Thành tiền");
                    for (SachGiaoKhoa sachGiaoKhoa : list) {
                        if (sachGiaoKhoa.getNhaXuatBan().equals(ten)) {
                            System.out.println(sachGiaoKhoa.toString());
                        }
                        
                    }
                    System.out.println("-----Danh sách sách tham khảo-----");
                    System.out.printf("%-20s%-20s%-20s%-10s%-30s%-20s%-20s\n", "Mã sách", "Ngày nhập", "Đơn giá", "Số lượng", "Nhà xuất bản", "Thuế", "Thành tiền");
                    for (SachThamKhao sachThamKhao : list2) {
                        if (sachThamKhao.getNhaXuatBan().equals(ten)) {
                            System.out.println(sachThamKhao.toString());
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
