package Conditionals;

import java.util.Scanner;

/*
Input a number and print all the factors of that number (use loops)
 */
public class q3 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        n = input.nextInt();
        for (int i =1 ; i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
            else {
                System.out.print("");
            }
            
        }
    }
}
