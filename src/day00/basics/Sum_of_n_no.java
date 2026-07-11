package day00.basics;

import java.util.Scanner;

public class Sum_of_n_no {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = ip.nextInt();
        int sum = n*(n+1)/2;
        System.out.println("The sum of N numbers is : "+sum);
    }
}
