package baitapjames.bai11;

import java.util.HashMap;
import java.util.Locale;

public class KiemTraTu {
    public static void main(String[] args) {
        String string = "Hello everybody Hello World heLLo WORld xyz";
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].toUpperCase(Locale.ROOT);
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : strings) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s,1);
            } else {
                Integer a = hashMap.get(s);
                a = a + 1;
                hashMap.put(s, a);
            }
        }
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
    }
}
