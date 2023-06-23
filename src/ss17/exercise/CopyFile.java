package ss17.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = readFile("D:\\Codegym_source\\module2\\module2_java\\src\\ss17\\exercise\\sourcefile");
        writeFile("D:\\Codegym_source\\module2\\module2_java\\src\\ss17\\exercise\\targetfile", list2);
    }

    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                stringList.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Not found");
        }
        return stringList;
    }

    public static void writeFile(String path, List<String> list) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
        }
    }
}
