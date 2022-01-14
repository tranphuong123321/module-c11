package bai_tap_lam_them_oop.service.Impl;

import bai_tap_lam_them_oop.models.Oto;
import bai_tap_lam_them_oop.models.XeTai;
import bai_tap_lam_them_oop.service.XeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiServiceImpl implements XeTaiService {
    static List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void themMoiXeTai() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhap nam san xuat");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap tai trong");
        int trongTai=scanner.nextInt();
        XeTai xetai =new XeTai(bienKiemSoat,  tenHangSanXuat,  namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xetai);

    }

    @Override
    public void hienThiXeTai() {
        for(XeTai xetai:xeTaiList){
            System.out.println(xetai);
        }

    }

    @Override
    public void xoaXeTai() {

    }
}
