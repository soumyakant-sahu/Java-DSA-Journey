package day04.Searching;

import java.util.Scanner;

public class insert_ele {
   public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int lo =0,hi=arr.length-1;
        int y = ip.nextInt();
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(y>arr[mid]){
                lo = mid+1;
            }
            else{
            hi = mid-1;
            }
        }
        System.out.println(lo);
    }
}
