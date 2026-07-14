package day02.Sorting;

import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
