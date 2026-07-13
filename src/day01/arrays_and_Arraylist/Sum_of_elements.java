package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class Sum_of_elements {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        for (int ele : arr) {
            sum += ele;
        }
        System.out.println(sum);
    }
}
