import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};
        String[] hasilArray = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(hasilArray));

        String[] array3 = {"lee", "jin"};
        String[] array4 = {"kazuya", "panda"};
        String[] hasilArray2 = mergeArrays(array3, array4);
        System.out.println(Arrays.toString(hasilArray2));
    }
    public static String[] mergeArrays(String[] array1, String[] array2) {
        ArrayList<String> mergedName = new ArrayList<String>(Arrays.asList(array1));

        for (String name : array2) {
            if (!mergedName.contains(name)) {
                mergedName.add(name);
            }
        }
        String[] mergedArr = mergedName.toArray(new String[0]);
        return mergedArr;
    }
}