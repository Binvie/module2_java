package ss16.exercise.exercise1.data.common;

import ss16.exercise.exercise1.data.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<Product> readBinaryFile(String path) {
        List<Product> productList = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }  catch (Exception e) {

        }
        return productList;
    }

    public static void writeBinaryFile(String path, List<Product> productList) {
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

//    public static void writeFile(String path, List<Product> list) {
//        try {
//            FileWriter fr = new FileWriter(path);
//            BufferedWriter bw = new BufferedWriter(fr);
//            for (Product po : list) {
//                bw.write(po.toString());
//                bw.newLine();
//            }
//            bw.close();
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static List<Product> readFile(String path) {
//        List<Product> productList = new ArrayList<>();
//        try {
//            FileReader fo = new FileReader(path);
//            BufferedReader fw = new BufferedReader(fo);
//            String line = "";
//            while (true) {
//                line = fw.readLine();
//                if (line == null) {
//                    break;
//                }
//                String[] txt = line.split(",");
//                int id = Integer.parseInt(txt[0]);
//                String name = txt[1];
//                int price = Integer.parseInt(txt[2]);
//                String brand = txt[3];
//                String description = txt[4];
//                productList.add(new Product(id, name, price, brand, description));
//                fw.close();
//                fo.close();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
