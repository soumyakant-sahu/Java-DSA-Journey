package day01.arrays_and_Arraylist;

import java.util.Arrays;

public class Test {

    public static int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;
        int pair = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];

            System.out.println(
                    "i = " + i + ", j = " + j +
                            " → " + arr[i] + " + " + arr[j] +
                            " = " + sum
            );

            if (sum == k) {
                pair++;
                i++;
                j--;
            }
            else if (sum < k) {
                i++;
            }
            else {
                j--;
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4 , 3};
        int k = 6;

        int result = maxOperations(arr, k);

        System.out.println("Total pairs = " + result);
    }
}