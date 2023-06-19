package ss12.practice;

import java.util.*;

public class Age implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() > student2.getAge()){
            return 1;
        }else if (student1.getAge() == student2.getAge()){
            return 0;
        }else return -1;
    }

    public static void main(String[] args) {
        Student student = new Student("Thien",20,"hue");
        Student student1 = new Student("Nguyen",25,"QB");
        Student student2 = new Student("Thoi em",16,"DN");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Collections.sort(list);
        for (Student value: list) {
            System.out.println(value.toString());
        }
        Age ageComparator = new Age();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student st: list) {
            System.out.println(st.toString());
        }
    }


}
