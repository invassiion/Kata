package kataPackage;

import java.util.HashMap;
import java.util.Map;

public class KataString {
    public static  String  greet(String name){
        return "Hello, " + name + " how are you doing today?";
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            int frequency = charFrequency.getOrDefault(c,0) + 1;
            charFrequency.put(c, frequency);
        }
        return charFrequency;
    }
}
