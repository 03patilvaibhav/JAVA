package Conditionals;

import java.util.Scanner;

/*
Take integer inputs till the user enters 0 and print the largest number from all.
 */
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max =0;
        do{
            System.out.println("Enter the number: ");
            n = sc.nextInt();
            System.out.println("Enter 0 to end the loop");
            if (n > max) {
                max = n;
            }
        }
        while (n!=0);
        {

            System.out.println("The largest number is: "+max);
        }
    }
}
