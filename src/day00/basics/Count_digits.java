package day00.basics;

import java.util.Scanner;

public class Count_digits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int y = ip.nextInt();
        int n = y;
        int count = 0;
        while(n!=0){
            int x = n%10;
            count++;
            n/=10;
        }
        System.out.println("The no of digits in "+y+" is "+count+".");
    }
}
