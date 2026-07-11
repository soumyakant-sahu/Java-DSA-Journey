package day00.basics;

import java.util.Scanner;

public class prime_no_print {
   public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int x = ip.nextInt();

       for (int i = 2; i <= x; i++) {
           boolean isprime =true;
           //for checking prime
           for (int j = 2; j < i/2; j++) {
               if (i%j == 0) {
                   isprime = false;
                   break;
               }
           }
           if (isprime){
               System.out.print(i+" ");
           }

       }

    }
}
