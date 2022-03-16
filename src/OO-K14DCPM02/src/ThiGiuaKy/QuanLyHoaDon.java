package ThiGiuaKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHoaDon {
    Scanner scanner = new Scanner(System.in); 

    private List<HoaDonTheoGio> list = new ArrayList<>();
    private List<HoaDonTheoNgay> list2 = new ArrayList<>();

    public void nhapHoaDonTheoGio() throws ParseException {
        while (true) {
            HoaDonTheoGio hoaDonTheoGio = new HoaDonTheoGio();
            hoaDonTheoGio.input();
            list.add(hoaDonTheoGio);
            System.out.print("Thêm sách giáo khoa(y/n): ");
            if (scanner.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void nhapHoaDonTheoNgay() throws ParseException {
        while (true) {
            HoaDonTheoNgay hoaDonTheoNgay = new HoaDonTheoNgay();
            hoaDonTheoNgay.input();
            list2.add(hoaDonTheoNgay);
            System.out.print("Thêm sách tham khảo(y/n): ");
            if (scanner.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void tongSoLuong() {
        double tongG = 0, tongN = 0;
        for (HoaDonTheoGio a : list) {
            tongG++;
        }
        for (HoaDonTheoNgay b : list2) {
            tongN++;
        }
        System.out.println("Tổng số lượng hoá đơn phòng thuê theo giờ: " + tongG);
        System.out.println("Tổng số lượng hoá đơn phòng thuê theo ngày: " + tongN);
    }

    public void inDanhSach() {
        System.out.println("\t----------------------------------- Danh sách hoá đơn theo giờ -----------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã hoá đơn", "Ngày hoá đơn", "Tên khách hàng", "Mã phòng", "Đơn giá", "Số giờ thuê", "Thành tiền");
        for (HoaDonTheoGio hoaDonTheoGio : list) {
            System.out.println(hoaDonTheoGio.toString());
        }

        System.out.println("\t----------------------------------- Danh sách hoá đơn theo ngày -----------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "Mã hoá đơn", "Ngày hoá đơn", "Tên khách hàng", "Mã phòng", "Đơn giá", "Số ngày thuê","Thành tiền");
        for (HoaDonTheoNgay hoaDonTheoNgay : list2) {
            System.out.println(hoaDonTheoNgay.toString());
        }
    }

    public void tinhTrungBinhThanhTien() throws ParseException {
        String ngayDauThang = "01/09/2013";
        String ngayCuoiThang = "30/09/2013";
        double tongG = 0, tongN = 0, tbG = 0, tbN = 0, tb = 0;
        int a = 0, b = 0;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (HoaDonTheoGio hoaDonTheoGio : list) {
            if (hoaDonTheoGio.getNgayHD().after(simpleDateFormat.parse(ngayDauThang)) || hoaDonTheoGio.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0
                && hoaDonTheoGio.getNgayHD().before(simpleDateFormat.parse(ngayCuoiThang)) || hoaDonTheoGio.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0) {
                tongG += hoaDonTheoGio.getThanhTien();
                a++;
            }
        }
       
        for (HoaDonTheoNgay hoaDonTheoNgay : list2) {
            if (hoaDonTheoNgay.getNgayHD().after(simpleDateFormat.parse(ngayDauThang)) || hoaDonTheoNgay.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0
                && hoaDonTheoNgay.getNgayHD().before(simpleDateFormat.parse(ngayCuoiThang)) || hoaDonTheoNgay.getNgayHD().compareTo(simpleDateFormat.parse(ngayDauThang)) == 0) {
                tongN += hoaDonTheoNgay.getThanhTien();
                b++;
            }
        }

        tbG = tongG / a;
        tbN = tongN / b;
        tb = (tongG + tongN) / (a + b);
        System.out.println("Trung bình thành tiền của hoá đơn thuê phòng theo giờ trong tháng 9 năm 2013 là: " + tbG);
        System.out.println("Trung bình thành tiền của hoá đơn thuê phòng theo ngày trong tháng 9 năm 2013 là: " + tbN);
        System.out.println("Trung bình thành tiền của tất cả hoá đơn thuê phòng trong tháng 9 năm 2013 là: " + tb);
    }
}
