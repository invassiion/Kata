import kataPackage.KataCountingSheep;
import kataPackage.KataDoubleArraySum;
import kataPackage.KataLessThenN;
import kataPackage.Solution;

public class Main {
    public static void main(String[] args) {
        System.out.println("Less Then N");
        System.out.println(KataLessThenN.oddCount(15345));

        System.out.println("____________________________");

        System.out.println("KataDoubleArraySum");
        double[] numbers = {2.3, 3.4, 45.6};
        System.out.println(KataDoubleArraySum.sum(numbers));

        System.out.println("____________________________");
        System.out.println("KataCountingSheep");

        Boolean[] array = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        System.out.println(KataCountingSheep.countSheeps(array));
        System.out.println("____________________________");


        Solution merger = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println("\n ____________________________");

        Solution remover = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int k = remover.removeDuplicates(nums);
        System.out.println("Количество уникальных элементов (не более двух раз): " + k);
        System.out.print("Массив после удаления дубликатов: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}