package day04.Searching;

import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the no of elements want to insert: ");
        int x = ip.nextInt();
        int [] arr = new int[x];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = ip.nextInt();
        int lo =0 ,hi=arr.length;
        int index = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target>arr[mid]){
                lo = mid+1;
            } else if (target<arr[mid]) {
                hi = mid-1;
            }
            else{
                index = mid;
                break;
            }
        }
        System.out.println("The number is present in "+index+" position and the number is "+arr[index]);
    }
}
