package day00.basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = ip.nextInt();
        int y = x;
        int rev = 0 ;
        while(y>0){
            int z = y%10;
            rev = (rev*10)+z;
            y/=10;
        }
        if (x==rev){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
