import java.util.ArrayList;
import java.util.List;

public class EliminasiAngka {

    public static void main(String[] args) {
        String input1 = "76523752";
        List<Integer> eliminasi1 = findUniqueNumbers(input1);
        System.out.println(eliminasi1);

        String input2 = "1122";
        List<Integer> eliminasi2 = findUniqueNumbers(input2);
        System.out.println(eliminasi2);
    }
    public static List<Integer> findUniqueNumbers(String input) {
        List<Integer> unique = new ArrayList<Integer>();
        int[] count = new int[10];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count[c - '0']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                unique.add(i);
            }
        }

        return unique;
    }
}