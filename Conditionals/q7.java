package Conditionals;

import java.util.Scanner;

/*
Sum Of A Digits Of Number
 */
public class q7 {
    public static void main(String[] args) {
        int n,rem;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        n = sc.nextInt();
        while(n>0){
            rem = n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("The sum of digits is: "+sum);
    }
}
