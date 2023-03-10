package Begginer;

import java.util.Scanner;

/*
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 */
public class Q3 {
    public static void main(String[] args) {
        int time ;
        float rate ;
        double principal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter THE principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter THE Rate%: ");
        rate = input.nextFloat();
        System.out.print("Enter THE Time: ");
        time = input.nextInt();
        System.out.println("Calculating Simple Interest");
        simpleInterset(time,rate,principal);

    }
    static void simpleInterset(int time , float rate, double principal){
        double SI = time*rate*principal/100;
        System.out.println("The Simple Interest is: " +SI);
    }
}
