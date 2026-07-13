package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class Index_of_ele {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int target = ip.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                System.out.println("Index of Target Element is "+i);
            }
        }

    }
}
