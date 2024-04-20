package kataPackage;

import java.util.Arrays;

public class KataDoubleArraySum {
    public static double sum(double[] numbers) {
        double sum =  Arrays.stream(numbers).sum();
        return sum;
    }


}
