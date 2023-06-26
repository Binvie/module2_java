package ss16.exercise.exercise2;

import ss16.exercise.exercise1.data.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryCopyFile {
    public static List<String> readBinaryFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {

        }
        return stringList;
    }
    public static void writeBinaryFile(String path, List<String> productList) {
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
    public static List<String> stringList = new ArrayList<>();
private static final String SOURCE_PATH = "D:\\Codegym_source\\module2\\module2_java\\src\\ss16\\exercise\\exercise2\\source.dat";
private static final String TARGET_PATH = "D:\\Codegym_source\\module2\\module2_java\\src\\ss16\\exercise\\exercise2\\target.dat";
    static {
        stringList.add("advanced physics");
    }
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list = readBinaryFile(SOURCE_PATH);
        System.out.println(list);
    writeBinaryFile(TARGET_PATH,list);
    }
}
