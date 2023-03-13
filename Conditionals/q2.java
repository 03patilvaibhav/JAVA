package Conditionals;

import java.util.Scanner;

/*
Subtract the Product and Sum of Digits of an Integer
 */
public class q2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int digit,prod = 1,sum=0;
        while(n!=0)
        {
            digit = n % 10;
            sum += digit;
            prod *= digit;
            n = n/10;
        }
        int res = prod - sum;
        System.out.println(res);
    }
    }


