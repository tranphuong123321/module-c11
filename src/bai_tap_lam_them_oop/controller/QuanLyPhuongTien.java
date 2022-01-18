package bai_tap_lam_them_oop.controller;

import bai_tap_lam_them_oop.service.Impl.OtoServiceImpl;
import bai_tap_lam_them_oop.service.Impl.XeMayServiceImpl;
import bai_tap_lam_them_oop.service.Impl.XeTaiServiceImpl;
import bai_tap_lam_them_oop.service.OtoService;
import bai_tap_lam_them_oop.service.XeMayService;
import bai_tap_lam_them_oop.service.XeTaiService;

import java.util.Scanner;

public class QuanLyPhuongTien {
    public static void main(String[] args) {
        hienThiMeNuChinh();
    }

    public static void hienThiMeNuChinh() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("Menu Chinh");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiển thị phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Thoát.");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai, hay nhap so tu 1 den 4");
            }
            switch (choice) {
                case 1:
                    themMoiPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void themMoiPhuongTien() {
        OtoService otoService = new OtoServiceImpl();
        XeTaiService xeTaiService = new XeTaiServiceImpl();
        XeMayService xeMayService = new XeMayServiceImpl();

            System.out.println("Ban muon them moi phuong tien nao");
            System.out.println("1. Oto");
            System.out.println("2. Xe tai");
            System.out.println("3. Xe may");
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban nhap sai roi, hay nhap lai");
            }
            switch (choice) {
                case 1:
                    otoService.themMoiOto();
                    break;
                case 2:
                    xeTaiService.themMoiXeTai();
                    break;
                case 3:
                    xeMayService.themMoiXeMay();
                    break;

            }

        }


    public static void hienThiPhuongTien() {
        int choice = 0;
        boolean check = true;
        OtoService otoService = new OtoServiceImpl();
        XeTaiService xeTaiService = new XeTaiServiceImpl();
        XeMayService xeMayService = new XeMayServiceImpl();
        while (check) {
            System.out.println("Ban muon hien thi phuong tien nao");
            System.out.println("1. Oto");
            System.out.println("2. Xe tai");
            System.out.println("3. Xe may");
            System.out.println("4. Quay lai menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban nhap sai roi, hay nhap lai");
            }
            switch (choice) {
                case 1:
                    otoService.hienThiOto();
                    break;
                case 2:
                    xeTaiService.hienThiXeTai();
                    break;
                case 3:
                    xeMayService.hienThiXeMay();
                    break;
                case 4:
                    hienThiMeNuChinh();
                    break;

            }

        }
    }

    public static void xoaPhuongTien() {
        OtoService otoService = new OtoServiceImpl();
        XeTaiService xeTaiService = new XeTaiServiceImpl();
        XeMayService xeMayService = new XeMayServiceImpl();
        int choice = 0;
        boolean check = true;
        while (check) {
            System.out.println("Ban muon xoa phuong tien nao");
            System.out.println("1. Oto");
            System.out.println("2. Xe tai");
            System.out.println("3. Xe may");
            System.out.println("4. Quay lai menu");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ban nhap sai roi, hay nhap lai");
            }
            switch (choice) {
                case 1:
                    otoService.xoaOto();
                    break;
                case 2:
                    xeTaiService.xoaXeTai();
                    break;
                case 3:
                    xeMayService.xoaXeMay();
                    break;
                case 4:
                    hienThiMeNuChinh();
                    break;
            }
        }
    }
}
