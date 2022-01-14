package bai_tap_lam_them_oop.service.Impl;

import bai_tap_lam_them_oop.models.XeMay;
import bai_tap_lam_them_oop.service.XeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayServiceImpl implements XeMayService {
    static List<XeMay> xemayList = new ArrayList<>();

    @Override
    public void themMoiXeMay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhap nam san xuat");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap cong suat");
        int congSuat = scanner.nextInt();
        XeMay xemay=new XeMay( bienKiemSoat,  tenHangSanXuat,  namSanXuat,  chuSoHuu,  congSuat);
        xemayList.add(xemay);
    }

    @Override
    public void hienThiXeMay() {
        for(XeMay xemay:xemayList){
            System.out.println(xemay);
        }

    }

    @Override
    public void xoaXeMay() {

    }
}
