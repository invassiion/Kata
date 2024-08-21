package kataPackage;

public class KataOddCount {
    public static int oddCount(int n) {
        int k = 0;
        for (int i = 1; i < n; i++ ) {
           if (i % 2 != 0) {
               k++;
           }
        }


        return k;

    }
}
