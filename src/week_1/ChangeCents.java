package week_1;

import java.util.Scanner;

public class ChangeCents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the purchase amount [0-100 ]:");
        int purchase = input.nextInt();
        if (purchase < 0 || purchase > 100) {
            System.out.println("The input must in range of 0 to 100!");
            System.exit(0);
        }
        int change = 100 - purchase;
        int remainChange = change;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        if (remainChange >= 25) {
            quarters = (int) (remainChange / 25);
            remainChange = remainChange % 25;
        }
        if (remainChange >= 10) {
            dimes = (int) (remainChange / 10);
            remainChange = remainChange % 10;
        }
        if (remainChange >= 5) {
            nickels = (int) (remainChange / 5);
            remainChange = remainChange % 5;
        }
        if (remainChange >= 1) {
            pennies = (int) (remainChange / 1);
        }

        System.out.println("Your change of " + change + " cents is given as:\n" + quarters + " Quarters\n" + dimes + " Dimes\n" + nickels + " Nickels\n" + pennies + " Pennies");
    }
}