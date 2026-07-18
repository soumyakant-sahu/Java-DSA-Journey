package day04.Searching;

import java.util.Scanner;

public class Peak_Index_in_mountain_array {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int[] arr = new int[x];
        for (int i = 0 ;i<arr.length;i++){
            arr[i] = ip.nextInt();
        }
        int lo =1,hi=x-2;
        int index = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid]){
                index = mid;
                break;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid-1]>arr[mid]){
                lo =mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(index);
    }
}
