package ss16.exercise.repository;

import ss16.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWrite {
    public static void main(String[] args) {
        Product product = new Product();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Thoi", 300, "Dn", "hơi non"));
        productList.add(new Product(2, "Hai", 500, "SG", "hơi tra"));
        productList.add(new Product(3, "Sang", 1000, "Hue", "hơi non"));
        productList.add(new Product(4, "Thien", 3000, "Hue", "hơi cay"));
        writeFile("module2_java/src/ss16/exercise/data", productList);
        List<Product> productsFromReadFile = readFile("module2_java/src/ss16/exercise/view/data");
        for (Product po: productsFromReadFile) {
            System.out.println(po);
        }
    }
    public static void writeFile(String path, List<Product> list) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fr);
            for (Product po : list) {
                bw.write(po.toString());
                bw.newLine();
            }
            bw.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile(String path) {
        try {
            FileReader fo = new FileReader(path);
            BufferedReader fw = new BufferedReader(fo);
            String line = "";
            while (true) {
                line = fw.readLine();
                if (line == null){
                    break;
                }
                String txt[] = line.split("\\s+");
                System.out.println(Arrays.toString(txt));
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
