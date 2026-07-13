package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class snd_smallest {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int snd_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                snd_min = min;
                min = arr[i];
            }
            if(arr[i]<snd_min && arr[i]!=min) {
                snd_min = arr[i];
            }
        }
        System.out.println(snd_min);
    }
}
