package day00.basics;

import java.util.Scanner;

public class Reverse_no {
     public static void main(String[] args) {
         Scanner ip = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int a = ip.nextInt();
         int x = a;
         int rev = 0;
         while(x>0){
             int y = x%10;
             rev = (rev*10)+y;
             x/=10;
         }
         System.out.println("The reverse of the number "+a+" is "+rev+".");
    }
}
