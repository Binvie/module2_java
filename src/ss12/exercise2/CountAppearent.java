package ss12.exercise2;

import java.util.*;

public class CountAppearent {

    public static void main(String[] args) {
        String str = "Insights Into The Software Testing Career Insights Into The Software Testing Career Insights Into The Software Testing Career";
        String[] arr = str.split(" ");
        String key = "";
        int value = 0;
        System.out.println(Arrays.toString(arr));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i].toLowerCase();
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else map.put(key, 1);
        }
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println("Word " + key + " apear " + map.get(key) + "times");
        }
    }
}
