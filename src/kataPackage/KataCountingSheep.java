package kataPackage;

import java.util.Arrays;

public class KataCountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            return 0;
        }

       return (int) Arrays.stream(arrayOfSheeps)
               .filter(Boolean.TRUE::equals)
               .count();
    }
}
