package day01.arrays_and_Arraylist;

import java.util.Scanner;

public class Max_Min {
   public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int x = ip.nextInt();
       int [] arr = new int[x];
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for (int i = 0; i < arr.length; i++) {
           arr[i] = ip.nextInt();
       }
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]>max){
               max = arr[i];
           }
           if(arr[i]<min){
               min = arr[i];
           }
       }
       System.out.println(max+" "+min);
    }
}
