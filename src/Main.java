import kataPackage.KataCountingSheep;
import kataPackage.KataDoubleArraySum;
import kataPackage.KataLessThenN;

public class Main {
    public static void main(String[] args) {
        System.out.println("Less Then N");
        System.out.println(KataLessThenN.oddCount(15345));

        System.out.println("____________________________");

        System.out.println("KataDoubleArraySum");
        double[] numbers ={2.3, 3.4, 45.6};
        System.out.println(KataDoubleArraySum.sum(numbers));

        System.out.println("____________________________");
        System.out.println("KataCountingSheep");

        Boolean[] array = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};

        System.out.println(KataCountingSheep.countSheeps(array));
        System.out.println("____________________________");
    }
}