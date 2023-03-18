import java.util.Arrays;

public class SortedNumberTargetSum {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 6};
        int targetSum1 = 6;
        int[] hasil1 = findPairSum(numbers1, targetSum1);
        System.out.println(Arrays.toString(hasil1));

        int[] numbers2 = {2, 5, 9, 11};
        int targetSum2 = 11;
        int[] result2 = findPairSum(numbers2, targetSum2);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] findPairSum(int[] numbers, int targetSum) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == targetSum) {
                return new int[] {left, right};
            }
            else if (sum < targetSum) {
                left++;
            }
            else {
                right--;
            }
        }

        // jika tidak ditemukan pasangan bilangan yang sesuai dengan target Sum
        return new int[] {-1,-1};
    }
}