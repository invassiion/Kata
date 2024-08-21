package kataPackage;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class KataMath {
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0 ) return "Even";
        else return "Odd";
    }

    public static int grow(int [] x) {
        int avg = 1;
        for (int i = 0; i < x.length; i++) {
            avg = avg * x[i];
        }
        return avg;

    }

    public static int growStream(int [] x) {
        return Arrays.stream(x).reduce(1,(a,b) -> a*b);
    }

    public int sum(List<?> mixed) {
       int sum = 0;
       for (Object element : mixed) {
           if (element instanceof String) {
               sum += Integer.parseInt((String) element);
           } else if (element instanceof Integer) {
               sum += (int) element;
           }
       }
       return sum;
    }
}
