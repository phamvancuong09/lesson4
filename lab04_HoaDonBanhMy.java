package lesson3;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class lab04_HoaDonBanhMy {
    String maHD, tenKH, addressGH;
    String ngayLapHD;
    int soLuongCG, tienKM;
    float giaBan1chiec;
    double tongTienHang, tongTienPhaiThanhToan;

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn: ");
        maHD = sc.nextLine();
        System.out.println("Nhập ngày lập hóa đơn: ");
        ngayLapHD = sc.nextLine();
        System.out.println("Nhập tên khách hàng: ");
        tenKH =sc.nextLine();
        System.out.println("Nhập địa chỉ giao hàng: ");
        addressGH = sc.nextLine();

        System.out.println("Nhập tiền khuyến mãi: ");
        tienKM = sc.nextInt();
        System.out.println("Nhập số lượng bánh cần giao");
        soLuongCG = sc.nextInt();
        System.out.println("Gía bán 1 chiếc bánh: ");
        giaBan1chiec = sc.nextFloat();
    }


    public void inHoaDon(){
        System.out.println("===========Thông tin hóa đơn=============");
        System.out.println("Mã hóa đơn: "+maHD);
        System.out.println("Ngày lập hóa đơn; "+ngayLapHD);
        System.out.println("Địa chỉ giao hàng: "+addressGH);
        System.out.println("Tiền khuyến mãi: "+tienKM);
        System.out.println("Số lượng bánh cần giao: "+soLuongCG);
        System.out.println("Gía 1 chiếc bánh: "+giaBan1chiec);
        tongTienHang = (soLuongCG * giaBan1chiec) + (soLuongCG * giaBan1chiec * ((double) tienKM /100));
        if(soLuongCG >=10 && soLuongCG <100){
            double giaBan1chiec1 = giaBan1chiec * ((double) 10 /100);
            tongTienHang = (soLuongCG * giaBan1chiec1) + (soLuongCG * giaBan1chiec1 * ((double) tienKM /100));
            tongTienPhaiThanhToan = tongTienHang;
            System.out.println("Tổng tiền phải thanh toán: " +tongTienPhaiThanhToan);
        }
        else if(soLuongCG >=100){
            tongTienPhaiThanhToan = tongTienHang * ((double) 20 /100);
            System.out.println("Tổng tiền phải thanh toán: " +tongTienPhaiThanhToan);
        }
    }

}
