package day00.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ip.nextInt();
        int fact = 1;
       while(n!=1){
           fact = fact*n;
           n -=1;
       }
        System.out.println(fact);
    }
}
