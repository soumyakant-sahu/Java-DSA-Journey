package day02.Sorting;

import java.util.Scanner;

public class bubble_sort_reverse {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
