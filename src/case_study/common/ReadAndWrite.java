package case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public final static String FURAMA_PATH = "D:\\Codegym_source\\module2\\module2_java\\src\\case_study\\common\\data.csv";
    public static final String EMPLOYEE = "D:\\Codegym_source\\module2\\module2_java\\src\\case_study\\common\\employee.csv";

    public List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public void writeFile(String path, List<String> list) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String o : list) {
                bufferedWriter.write(o);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
