package day00.basics;

import java.util.Scanner;

public class Even_no {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ip.nextInt();
        System.out.print("Even numbers: ");
        for (int i=1;i<=n;i++){
         if(i%2==0) {
             System.out.print(i + " ");
         }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i=1;i<=n;i++){
            if(i%2!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
