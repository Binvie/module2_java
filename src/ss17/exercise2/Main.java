package ss17.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1 = PracticeReadFile.readFile("D:\\Codegym_source\\module2\\module2_java\\src\\ss17\\exercise2\\source.csv");
        PracticeReadFile.display("D:\\Codegym_source\\module2\\module2_java\\src\\ss17\\exercise2\\source.csv",list1);
//        System.out.println(list3);
    }
}
