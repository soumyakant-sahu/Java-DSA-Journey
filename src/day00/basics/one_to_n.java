package day00.basics;

import java.util.Scanner;

public class one_to_n {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = ip.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = n; i > 0 ; i--) {
            System.out.print(i+" ");
        }
    }
}
