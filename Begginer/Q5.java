package Begginer;

import java.util.Scanner;

/*
Take 2 numbers as input and print the largest number.
 */
public class Q5 {
    public static void main(String[] args) {
        double num1;
        double num2;
        System.out.println("The First Number : ");
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        System.out.println("The Second Number : ");
        num2 = input.nextDouble();
        if(num1 > num2)
        {
            System.out.println("The number 1 is greater");
        }
        else if (num1 < num2)
        {
            System.out.println("The number 2 is greater");
        }
        else
        {
            System.out.println("Bye");
        }


    }
}
