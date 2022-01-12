package case_study.service.Impl;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
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
        System.out.println("Nhap trinh do");
        System.out.println("1. Trung Cấp.");
        System.out.println("2. Cao Đẳng");
        System.out.println("3. Đại Học");
        System.out.println("4. Sau đại Học");
        String level = " ";
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                level = "Trung Cấp";
                break;
            case 2:
                level = "Cao Đẳng";
                break;
            case 3:
                level = "Đại Học";
                break;
            case 4:
                level = "Sau đại Học";
                break;
        }
        System.out.println("Nhap vi tri");
        String position = scanner.nextLine();
        System.out.println("Nhap muc luong");
        int salary = scanner.nextInt();
        Employee employee = new Employee(id,  name,  dayOfBirth,  gender,  idCard,  numberPhone,  gmail, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
       // id, name, dayOfBirth, gender, idCard, numberPhone, gmail
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your id");
        int fixid = scanner.nextInt();
        boolean check = false;
        for (Person employee : employeeList) {
            System.out.println(employee.getId());
            if (employee.getId() == fixid) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("2. name");
                System.out.println("3. dateOfBirth");
                System.out.println("4. sex");
                System.out.println("5. idCard");
                System.out.println("6. numberPhone");
                System.out.println("7. gmail");
                System.out.println("8. level");
                System.out.println("9. position");
                System.out.println("10. salary");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                switch (choice) {
                    case 2: {
                        System.out.println("sua ten");
                        String fixName = scanner.nextLine();
                        employee.setName(fixName);
                        break;
                    }
                    case 3: {
                        System.out.println("sua ngay sinh");
                        String fixDayOfBirth = scanner.nextLine();
                        employee.setDayOfBirth(fixDayOfBirth);
                        break;
                    }
                    case 4: {
                        System.out.println("sua gioi tinh");
                        String fixGender = scanner.nextLine();
                        employee.setGender(fixGender);
                        break;
                    }
                    case 5: {
                        System.out.println("sua cmnd");
                        int fixIdCard = scanner.nextInt();
                        employee.setIdCard(fixIdCard);
                        break;
                    }
                    case 6: {
                        System.out.println("sua sdt");
                        int fixNumberPhone = scanner.nextInt();
                        employee.setNumberPhone(fixNumberPhone);
                        break;
                    }
                    case 7: {
                        System.out.println("sua email");
                        String fixMail = scanner.nextLine();
                        employee.setGmail(fixMail);
                        break;
                    }
                    case 8: {
                        System.out.println("sua trinh do");
                        String fixLevel = scanner.nextLine();
                        ((Employee) employee).setLevel(fixLevel);
                        break;
                    }
                    case 9: {
                        System.out.println("sua vi tri");
                        String fixPosition = scanner.nextLine();
                        ((Employee) employee).setPosition(fixPosition);
                        break;
                    }
                    case 10: {
                        System.out.println("sua luong");
                        int fixSalary = scanner.nextInt();
                        ((Employee) employee).setSalary(fixSalary);
                        break;
                    }

                }
            } else if (!check) {
                System.out.println("ID not found!");

            }
        }
    }
}