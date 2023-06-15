package ss10.exercise.exercise1;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> list = new Mylist<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.show();
        System.out.println(list.indexOf(2));
        System.out.println("element 4: " + list.get(4));
        System.out.println(list.size());
    }
}
