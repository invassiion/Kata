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

    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else return "No";
    }

    public static  String whoLikesIt(String... names){
         if (names.length == 0) {
             return "no one likes this";
         } else if (names.length == 1) {
             return  names[0] + " likes this";
         } else if (names.length == 2) {
             return names[0] + "and " + names[1] + " like this";
         } else if (names.length == 3) {
             return names[0] + ", " + names[1] + "and " +  names[2] + " like this";
         } else if (names.length >= 4 ){
             return names[0] +", " + names[1] + " and " + (names.length -2) +" others like this";
         }

        return "";
    }
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available){
      int maxCakes = Integer.MAX_VALUE;

      for (Map.Entry<String, Integer> ingredient : recipe.entrySet()) {
          String ingredientName = ingredient.getKey();
          int requiredAmount = ingredient.getValue();

          if (available.containsKey(ingredientName)) {
              int availableAmount = available.get(ingredientName);
              maxCakes = Math.min(maxCakes, availableAmount / requiredAmount);
          } else {
              return 0;
          }
      }
      return maxCakes;
    }
}
