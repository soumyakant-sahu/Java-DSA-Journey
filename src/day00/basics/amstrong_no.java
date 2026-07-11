package day00.basics;

import java.util.Scanner;

public class amstrong_no {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = ip.nextInt();;
        int y = x;
        int count = 0;
        int sum = 0;
        while(y>0){
           count++;
            y/=10;
        }
        y=x;
        while(y>0){
            int z = y%10;
            int mul = 1;
            for (int i = 0; i < count; i++) {
                mul = mul*z;
            }
            sum+=mul;
            y/=10;
        }
        if (sum==x){
            System.out.println(x+" is Amstrong No.");
        }
        else System.out.println(x+" is not Amstrong no.");
    }
}
