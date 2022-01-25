package bai_17.bai_tap.quan_ly_san_pham.service;

import bai_17.bai_tap.quan_ly_san_pham.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService  {
    List<Product> list= new ArrayList<>();
    {
        list=Write.readFile();
    }

    public void add() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap id san pham ");
        String id= scanner.nextLine();
        System.out.println(" moi nhap ten sp");
        String name=scanner.nextLine();
        System.out.println(" moi nhap nha sx ");
        String company=scanner.nextLine();
        System.out.println(" moi nha gia sp ");
        int price=Integer.parseInt(scanner.nextLine());
        System.out.println(" moi nha thuoc tinh sp");
        String profile=scanner.nextLine();
        list.add(new Product(id, name, company, price, profile));
        Write.writeFile(list);
    }


    public void display() {
        list=Write.readFile();
        for( Product product: list){
            System.out.println(product);
        }
    }



    public void search() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten sp muon tim kiem");
        String name=scanner.nextLine();
        for(Product product: list){
            if(product.getName().contains(name)){
                System.out.println(product);
            }

        }

    }

}
