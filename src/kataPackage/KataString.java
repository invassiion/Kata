package kataPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KataString {
    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            int frequency = charFrequency.getOrDefault(c, 0) + 1;
            charFrequency.put(c, frequency);
        }
        return charFrequency;
    }

    public String solution(int n) {
        int[] value_array = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < value_array.length; i += 1) {
            while (n >= value_array[i]) {
                n -= value_array[i];
                res.append(roman_char[i]);
            }

        }
        return res.toString();
    }

    public  String camelCase(String input) {
    String[] arr = input.split("(?=[A-Z])");
    return String.join(" ", arr);
    }


    public static int[] parse(String data) {
        int n = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (char c : data.toCharArray()) {
            switch (c) {
                case 'i' -> n++;
                case 'd' -> n--;
                case 's' -> n *= n;
                case 'o' -> arr.add(n);
                default -> { }
            }
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
