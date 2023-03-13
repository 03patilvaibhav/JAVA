package Conditionals;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

/*
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

 */
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        do {
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            sum += num;
        } while (num > 0);
        {

            System.out.println("Sum is " + sum);

        }
    }
}
