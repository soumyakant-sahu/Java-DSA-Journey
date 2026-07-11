package day00.basics;

import java.util.Scanner;

public class Mul_Table {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ip.nextInt();
        int mul = 1;
        for (int i = 1; i <=10 ; i++) {
            mul = n*i;
            System.out.println(n+" * "+i+" = "+mul);
        }
    }
}
