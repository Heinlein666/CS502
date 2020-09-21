package week_1;

import java.util.Scanner;

public class CalculateCircleArea {
    public static void main(String[] args) {
        System.out.println("Please Input The Radius:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("The area of circle is " + (3.1425 * radius * radius));
    }
}
