package Tuan05.Buoi9.Bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangTestDrive {
    public static void main(String[] args) throws ParseException {
        int luaChon;
        Scanner sc = new Scanner(System.in); 
        List<KhachHangVietNam> list = new ArrayList<>();
        List<KhachHangNuocNgoai> list2 = new ArrayList<>();
        do {
            System.out.println("----------Menu----------");
            System.out.println(">>1. Nhập danh sách các hoá đơn khách hàng tại Việt Nam.");
            System.out.println(">>2. Nhập danh sách các hoá đơn khách hàng nước ngoài.");
            System.out.println(">>3. Tổng số lượng của từng loại khách hàng.");
            System.out.println(">>4. Trung bình thành tiền của khách hàng nước ngoài.");
            System.out.println(">>5. Xuất danh sách các hoá đơn theo từng loại khách hàng.");
            System.out.println(">>6. Xuất danh sách các hoá đơn trong tháng 09 năm 2013.");
            System.out.println(">>7. thoát.");
            System.out.print("- Vui lòng nhập lựa chọn: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    while (true) {
                        KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
                        khachHangVietNam.input();
                        list.add(khachHangVietNam);
                        System.out.print("Thêm hoá đơn khách hàng(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();
                        khachHangNuocNgoai.input();
                        list2.add(khachHangNuocNgoai);
                        System.out.print("Thêm hoá đơn khách hàng(y/n): ");
                        sc.nextLine();
                        if (sc.nextLine().equals("n")) {
                            break;
                        }
                    }
                    break;
                case 3:
                    double tongKHVN = 0, tongKHNN = 0;
                    for (KhachHangVietNam a : list) {
                       tongKHVN += a.getSoLuong();
                    }
                    for (KhachHangNuocNgoai b : list2) {
                        tongKHNN += b.getSoLuong();
                    }
                    System.out.println("Tổng số lượng điện năng tiêu thụ của khách hàng Việt Nam: " + tongKHVN);
                    System.out.println("Tổng số lượng điện năng tiêu thụ của khách hàng nước ngoài: " + tongKHNN);
                    break;
                case 4:
                    double tong = 0, tb = 0;
                    int a = 0;
                    for (KhachHangNuocNgoai b : list2) {
                        a++;
                        tong += b.getThanhTien();
                    }
                    tb = tong/a;
                    System.out.println("Trung bình thành tiền của khách hàng nước ngoài: " + tb);
                    break;
                case 5:
                    System.out.println("-----Danh sách khách hàng Việt Nam-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã khách hàng", "Họ và tên KH", "Ngày ra hoá đơn", "Số lượng", "Đơn giá", "Đối tượng", "Định mức", "Thành tiền");
                    for (KhachHangVietNam khachHangVietNam : list) {
                        System.out.println(khachHangVietNam.toString());
                    }
                    System.out.println("-----Danh sách khách hàng nước ngoài-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã khách hàng", "Họ và tên KH", "Ngày ra hoá đơn", "Số lượng", "Đơn giá", "Quốc tịch", "Thành tiền");
                    for (KhachHangNuocNgoai khachHangNuocNgoai : list2) {
                        System.out.println(khachHangNuocNgoai.toString());
                    }
                    break;
                case 6:
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String ngayDau = "01/09/2013";
                    String ngayCuoi = "30/09/2013";
                    System.out.println("-----Danh sách các hoaas đơn trong tháng 09 năm 2013-----");
                    System.out.println("-----Danh sách khách hàng Việt Nam-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã khách hàng", "Họ và tên KH", "Ngày ra hoá đơn", "Số lượng", "Đơn giá", "Đối tượng", "Định mức", "Thành tiền");
                    for (KhachHangVietNam khachHangVietNam : list) {
                        if (khachHangVietNam.getNgayRaHD().after(simpleDateFormat.parse(ngayDau)) || khachHangVietNam.getNgayRaHD().compareTo(simpleDateFormat.parse(ngayDau))==0
                        && khachHangVietNam.getNgayRaHD().before(simpleDateFormat.parse(ngayCuoi)) || khachHangVietNam.getNgayRaHD().compareTo(simpleDateFormat.parse(ngayCuoi))==0) {
                            System.out.println(khachHangVietNam.toString());
                        }
                    }
                    System.out.println("-----Danh sách khách hàng nước ngoài-----");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã khách hàng", "Họ và tên KH", "Ngày ra hoá đơn", "Số lượng", "Đơn giá", "Quốc tịch", "Thành tiền");
                    for (KhachHangNuocNgoai khachHangNuocNgoai : list2) {
                        if (khachHangNuocNgoai.getNgayRaHD().after(simpleDateFormat.parse(ngayDau)) || khachHangNuocNgoai.getNgayRaHD().compareTo(simpleDateFormat.parse(ngayDau))==0
                        && khachHangNuocNgoai.getNgayRaHD().before(simpleDateFormat.parse(ngayCuoi)) || khachHangNuocNgoai.getNgayRaHD().compareTo(simpleDateFormat.parse(ngayCuoi))==0) {
                            System.out.println(khachHangNuocNgoai.toString());
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
