package bai_17.bai_tap.quan_ly_san_pham.view;

import bai_17.bai_tap.quan_ly_san_pham.service.ProductService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductService productService= new ProductService();
    public void menu() {
        int choice;
        do{
            System.out.println("Please choice:\n " +
                    "1. Add \n " +
                    "2. Display \n " +
                    "3. search \n "+
                    "4. Exit ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService .display();
                    break;
                case 3:
                    productService.search();
            }
        }while (choice!=4);
    }
}
