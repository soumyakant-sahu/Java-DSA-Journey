package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class Avg_of_all {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg = sum /arr.length;
        System.out.println("The avg is "+avg);
    }
}
