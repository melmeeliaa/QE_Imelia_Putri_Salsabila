public class RemovingDuplicates {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 3, 3, 6, 9, 9};
        int[] array2 = {2, 2, 2, 11};

        //Print banyaknya elemen setelah diremove angka yang duplikat
        int len1 = removeDuplicates(array1);
        System.out.println("Output 1 : " + len1);

        int len2 = removeDuplicates(array2);
        System.out.println("Output 2 : " + len2);
    }
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int nextNonDuplicate = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[nextNonDuplicate - 1] != array[i]) {
                array[nextNonDuplicate] = array[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }

}