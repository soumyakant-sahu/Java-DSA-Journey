package day04.Searching;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the no of elements want to insert: ");
        int x = ip.nextInt();
        int [] arr = new int[x];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }
        System.out.println("Enter the Target element: ");
        int target = ip.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("Index of the element is "+i+".");
            }
            else {
                System.out.println("Element is not present in the array.");
            }
        }
    }
}
