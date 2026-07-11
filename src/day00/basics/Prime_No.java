package day00.basics;

import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        boolean isprime =false;
        for (int i = 2; i <= x/2; i++) {
            if(x%i!=0){
                isprime =true;

            }
            else {
                isprime =false;
                break;
            }
        }
        if (isprime){
            System.out.println("Prime Number");
        }
        else System.out.println("Not prime number");
    }
}
