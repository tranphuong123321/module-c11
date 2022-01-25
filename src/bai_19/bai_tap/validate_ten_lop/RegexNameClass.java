package bai_19.bai_tap.validate_ten_lop;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNameClass {
    public static void regexNameClass(){


        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten lop");
        String name= scanner.nextLine();
        Pattern pattern=Pattern.compile("^[A|C|P][\\d]{4}[G-M]$");
        Matcher m=pattern.matcher(name);
        System.out.println(m.matches());


    }

    public static void main(String[] args) {
        regexNameClass();
    }
}
