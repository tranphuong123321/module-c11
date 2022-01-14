package bai_tap_lam_them_oop.service.Impl;

import bai_tap_lam_them_oop.models.Oto;
import bai_tap_lam_them_oop.service.OtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoServiceImpl implements OtoService {
    static List<Oto> otoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoiOto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("Nhap nam san xuat");
        int namSanXuat = scanner.nextInt();
        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap so cho ngoi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu xe");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        otoList.add(oto);
    }

    @Override
    public void hienThiOto() {
        for(Oto oto:otoList){
            System.out.println(oto);
        }

    }

    @Override
    public void xoaOto() {
        System.out.println("Nhap bien so xe muon xoa");
        String bienKiemSoat= scanner.nextLine();

    }
}
