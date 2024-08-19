package algorhitms;

import java.util.Arrays;
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


        InsertionSort insertionSort = new InsertionSort();
        int[] array =  new int[] {113,2,23,3435,66,5,343,6,8,9,0,5,654,7,6,45,3,345,67};
        System.out.println("INSERTION SORT");
        System.out.println("____________________");
        System.out.println(Arrays.toString(insertionSort.insertionSort(array)));


        MergeSort mergeSort  = new MergeSort();
        array = mergeSort.mergeSort(array,113,67);
        System.out.println(Arrays.toString(array));

    }





    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found.");
        } else {
            System.out.println(elementToSearch + " found at index: " + index);
        }
    }
}
