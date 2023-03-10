package Begginer;

import java.util.Scanner;

/*
To find out whether the given String is Palindrome or not.
 */
public class Q7 {
    public static void main(String[] args) {
        String test ;
        Boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to be checked");
        test = input.next();
        for(int i = 0; i < test.length()/2; i++){
            if(test.charAt(i) != test.charAt(test.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
    }
}
