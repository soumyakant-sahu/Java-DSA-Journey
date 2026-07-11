package day00.basics;

import java.util.Scanner;

public class leap_yr {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int yr = ip.nextInt();
        if((yr%4==0 && yr%100!=0 )||yr%400==0){
            System.out.println(yr+" is a leap year.");
        }
        else System.out.println(yr+" is not a leap year.");

    }
}
