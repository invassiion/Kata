package algorhitms;

import java.util.List;
import java.util.stream.Collectors;

public class MainAlgorhitms {
    public static void main(String[] args) {
        int index = LinearSearch.linearSearch(new int[] {89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        print(67,index);
        int index2 = BinarySearch.binarySearch(new int[] {89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        print(67, index2);

        int index3 = BinarySearch.recursiveBinarySearch(new int[]{3, 22, 27, 47, 57, 67, 89, 91, 95, 99}, 0, 10, 67);
        print(67, index3);


        String pattern = "AAABAAA";
        String text = "ASBNAAAAAABAAAAAAABAAAAAAGAHUHDHCHKSDNK";

        List<Integer> foudIndexes = KMPSearch.performKMPSearch(text,pattern);

        if (foudIndexes.isEmpty()) {
            System.out.println("Pattern not found in the given text String");
        } else {
            System.out.println("Pattern found in the given text String at positions: " + foudIndexes.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }





    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }
}
