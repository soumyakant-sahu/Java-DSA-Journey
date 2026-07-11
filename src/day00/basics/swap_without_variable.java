package day00.basics;

import java.util.Scanner;

public class swap_without_variable {
   public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       System.out.print("Enter first number: ");
       int x = ip.nextInt();
       System.out.print("Enter Second number: ");
       int y = ip.nextInt();
       x = x^y;
       y = x^y;
       x = x^y;
       System.out.println("First number after swaping: "+x);
       System.out.println("Second number after swaping: "+y);
    }
}
