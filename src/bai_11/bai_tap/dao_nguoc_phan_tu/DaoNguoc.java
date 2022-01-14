package bai_11.bai_tap.dao_nguoc_phan_tu;

import java.util.Scanner;
import java.util.Stack;

public  class DaoNguoc {
    public static void DaoNguoc(){
        Stack <String> arrayNumber=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời nhập vào các index trong mảng");
        String arr=scanner.nextLine();
        for(int i=0;i<arr.length();i++){
            arrayNumber.push(arr.charAt(i)+"");
        }
        System.out.println(" mảng sau khi đảo ngược các index ");
        for(int i=0;i<arr.length();i++){
            System.out.print(arrayNumber.pop());
        }
    }

    public static void main(String[] args) {
        DaoNguoc();

    }
}
