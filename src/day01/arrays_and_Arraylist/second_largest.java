package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int snd_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                snd_max = max;
                max = arr[i];
            }
            if(arr[i]>snd_max && arr[i]!=max) {
                snd_max = arr[i];
           }
        }
        System.out.println(snd_max);
    }
}
