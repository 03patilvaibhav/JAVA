package Begginer;

import java.util.Scanner;

/*
Take name as input and print a greeting message for that particular name.
 */
public class Q2 {
    public static void main(String[] args) {
    String name = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        name = input.nextLine();
        //System.out.print("Enter Your name: ");
        System.out.println("Hello Good morning " +name);
    }
}
