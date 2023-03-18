import java.io.FilterOutputStream;

public class SumWithK {
    public static void main(String[] args) {
        // Output: 9
        int[] array1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        System.out.println(findMaxSubArray(array1,k1));

        // Output: 7
        int[] array2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        System.out.println(findMaxSubArray(array2, k2));
    }
    public static int findMaxSubArray(int[] arr, int k) {
        int maxSum = 0, windowSum = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }

}
