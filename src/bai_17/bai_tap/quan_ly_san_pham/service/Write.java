package bai_17.bai_tap.quan_ly_san_pham.service;

import bai_17.bai_tap.quan_ly_san_pham.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Write {
    static final String PATH_FILE = "D:\\up_git\\ca\\src\\ss17_io_binary_file\\bai_tap\\quan_ly_san_pham\\view\\test.txt";

    public static List<Product> readFile() {
        File file = new File(PATH_FILE);
        List<Product> list = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                // khi mình ghi vào object nào thì cast đúng kiểu của object đó
                list = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void writeFile(List<Product> list) {
        File file = new File(PATH_FILE);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
