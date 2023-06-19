package ss12.practice;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thien", 20);
        hashMap.put("Thoi em", 16);
        hashMap.put("Sang", 20);
        hashMap.put("Nguyen", 25);
        Set<String> keys = hashMap.keySet();
        for (String kkey: hashMap.keySet()) {
            System.out.println("key : " + kkey + " " + hashMap.get(kkey));
        }
        System.out.println("Entries in hashmap:");


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        System.out.println("Display entries in ascending order of key");
        linkedHashMap.put("Thien", 20);
        linkedHashMap.put("Thoi em", 16);
        linkedHashMap.put("Sang", 20);
        linkedHashMap.put("Nguyen", 25);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Thoi em"));
    }
}
