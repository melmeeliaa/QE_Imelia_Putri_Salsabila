import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};
        int[] array3 = {3, 8};
        int[] array4 = {2, 8};

        int[] hasil1 = getUnique(array1, array2);
        int[] hasil2 = getUnique(array3, array4);

        System.out.print("Output 1: ");
        printArray(hasil1);
        System.out.print("Output 2: ");
        printArray(hasil2);
    }

    public static int[] getUnique(int[] array1, int[] array2) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array2) {
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array1) {
            if (!set.contains(num)) {
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}