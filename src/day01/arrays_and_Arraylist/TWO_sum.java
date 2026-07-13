package day01.arrays_and_Arraylist;

import java.util.*;

public class TWO_sum {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        System.out.println("Enter the target number: ");
        int target = ip.nextInt();
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
             if(arr[i]+arr[j] == target){
                 System.out.println(arr[i]+" "+arr[j]+" = "+target);
                 pair++;
             }
            }

        }
        System.out.println("Number of pairs are "+pair);
    }
}
