package case_study.service.Impl;

import case_study.models.Customer;
import case_study.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

    }

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap ten");
        String name = scanner.nextLine();
        System.out.println("Hay nhap ngay sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Hay nhap gioi tinh");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. LGBT");
        String gender = " ";
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;
            case 3:
                gender = "LGBT";
                break;
        }
        System.out.println("Nhap so chung minh");
        int idCard = scanner.nextInt();
        System.out.println("Nhap sdt");
        int numberPhone = scanner.nextInt();
        System.out.println("Nhap gmail");
        String gmail = scanner.nextLine();
        System.out.println("nhap loai khach");
        String typeOfGuest = scanner.nextLine();
        System.out.println("nhap dia chi");
        String address = scanner.nextLine();
        Customer customer=new Customer(id,  name,  dayOfBirth,  gender,  idCard,  numberPhone,  gmail, typeOfGuest,address);
        customerList.add(customer);


    }

    @Override
    public void edit() {

    }
}
