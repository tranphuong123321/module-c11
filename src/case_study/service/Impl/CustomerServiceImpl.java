package case_study.service.Impl;

import case_study.models.Customer;
import case_study.models.Person;
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
        Customer customer = new Customer(id, name, dayOfBirth, gender, idCard, numberPhone, gmail, typeOfGuest, address);
        customerList.add(customer);


    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id");
        int fixid = scanner.nextInt();
        boolean check = false;
        for (Person customer : customerList) {
            System.out.println(customer.getId());
            if (customer.getId() == fixid) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. name");
                System.out.println("3. dayOfBirth");
                System.out.println("4. gender");
                System.out.println("5. idCard");
                System.out.println("6. numberPhone");
                System.out.println("7. gmail");
                System.out.println("8. typeOfGuest");
                System.out.println("9. address");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua ten");
                        String fixName = scanner.nextLine();
                        customer.setName(fixName);
                        break;
                    }
                    case 3: {
                        System.out.println("sua ngay sinh");
                        String fixDayOfBirth = scanner.nextLine();
                        customer.setDayOfBirth(fixDayOfBirth);
                        break;
                    }
                    case 4: {
                        System.out.println("sua gioi tinh");
                        String fixGender = scanner.nextLine();
                        customer.setGender(fixGender);
                        break;
                    }
                    case 5: {
                        System.out.println("sua cmnd");
                        int fixIdCard = scanner.nextInt();
                        customer.setIdCard(fixIdCard);
                        break;
                    }
                    case 6: {
                        System.out.println("sua sdt");
                        int fixNumberPhone = scanner.nextInt();
                        customer.setNumberPhone(fixNumberPhone);
                        break;
                    }
                    case 7: {
                        System.out.println("sua email");
                        String fixMail = scanner.nextLine();
                        customer.setGmail(fixMail);
                        break;
                    }
                    case 8: {
                        System.out.println("sua loai khach");
                        String fixtypeOfGuest = scanner.nextLine();
                        ( (Customer)customer).setTypeOfGuest(fixtypeOfGuest);
                        break;
                    }
                    case 9: {
                        System.out.println("sua dia");
                        String fixaddress = scanner.nextLine();
                        ((Customer)customer).setAddress(fixaddress);
                        break;
                    }
                }
            }
        }
    }
}
