package day02.Sorting;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            int j= i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
