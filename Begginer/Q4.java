package Begginer;


import java.util.Objects;
import java.util.Scanner;

/*
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 */
public class Q4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        String operator;
        String sum = "+";
        String sub = "-";
        String div = "/";
        String multi = "*";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the Second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter the Operator: ");
        operator = input.next();
        if(Objects.equals(operator, sum)){
            result = num1 + num2;
            System.out.println("The sum is: " +result);

        } else if (Objects.equals(operator, sub)) {
            result = num1 - num2;
            System.out.println("The Subtraction is: " +result);
        } else if (Objects.equals(operator, div)) {
            result = num1 / num2;
            System.out.println("The division is: " +result);
        } else if (Objects.equals(operator, multi)) {
            result = num1 + num2;
            System.out.println("The multiplication is: " +result);
        }
        else {
            System.out.println("you have Entered something wrong");
        }
    }

}
