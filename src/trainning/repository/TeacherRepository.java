package trainning.repository;

import trainning.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository{
public static List<Teacher> teacherList = new ArrayList<>();
    static {
//        int id, String name, String date, Boolean gender, String major
        teacherList.add(new Teacher(1, "thien", "23/05/1997", "true", "physics"));
        teacherList.add(new Teacher(2, "Sang", "12/11/1997", "true", "math"));
        teacherList.add(new Teacher(3, "Thoi", "05/10/1998", "true", "science"));
        teacherList.add(new Teacher(4, "Nguyen", "03/05/1997", "true", "literature"));
    }
    public static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Teacher obj: teacherList) {
            System.out.println(obj);
        }
    }

    @Override
    public void addNew() {
//        teacherList.add( new Teacher());
    }

    @Override
    public void remove() {

    }

    @Override
    public void searchID() {

    }
}
