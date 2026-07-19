package day04.Searching;

import java.util.Scanner;

public class Max_count_of_positive_and_negative_numbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        int lo = 0,hi= arr.length-1;
        int negcount=0;
        int poscount=0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=0){
                hi=mid-1;
            }
            else{
                lo =mid+1;
            }
        }
        negcount =lo;
        lo = 0;hi= arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<=0){
                lo=mid+1;
            }
            else{
                hi =mid-1;
            }
        }
        poscount= arr.length-lo;
        System.out.println("Positive numbers: "+poscount+" Negative numbers: "+negcount);
    }
}
