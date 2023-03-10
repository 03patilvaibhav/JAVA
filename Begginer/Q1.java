package Begginer;

import java.util.Scanner;

/*
Write a program to print whether a number is even or odd, also take input from the user.
 */
public class Q1 {
    public static void main(String[] args) {
    int num;
    System.out.print("Please Enter the Num: " );
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if(num <0 || num ==0){   // condition to check whether the input is input or odd
        System.out.println("Number is neither not even or odd!!");
    } else if (num%2 ==0) {
        System.out.println("The Number is even");

    }
    else {
        System.out.println("The Number is odd");
        }
    }



}
