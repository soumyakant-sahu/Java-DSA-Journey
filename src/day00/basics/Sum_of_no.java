package day00.basics;

import java.util.Scanner;

public class Sum_of_no {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = ip.nextInt();
        int sum = 0;
        while(x>0){
            int y = x%10;
            sum+=y;
            x/=10;
        }
        System.out.println("The sum of the digits of number: "+sum);
    }
}
