package Conditionals;

import java.util.Scanner;

/*
Area Of Circle Java Program
 */
public class q1 {
    public static void main(String[] args) {

        float radius;
        System.out.print("Enter the radius of circle: ");
        Scanner input = new Scanner(System.in);
        radius = input.nextFloat();
        float result= 0f;
        result = (22/7) *radius*radius;
        System.out.println(result);
    }
}
