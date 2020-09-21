package week_2;

import java.util.Random;
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        int solution = -1;
        Scanner input = new Scanner(System.in);
        do{
            Random myRandom = new Random();
            int firstMultiplier = myRandom.nextInt(10);
            int secondMultiplier = myRandom.nextInt(10);
            System.out.println("How much is " + firstMultiplier + " times " + secondMultiplier + "?(-1 Quit)");
            solution = input.nextInt();
            if (solution == (firstMultiplier * secondMultiplier)) {
                System.out.println("Very Good!");
            }
            if (solution != (firstMultiplier * secondMultiplier) && solution != -1){
                while (solution != (firstMultiplier * secondMultiplier) && solution != -1) {
                    System.out.println("No. Please try again.");
                    System.out.println("How much is " + firstMultiplier + " times " + secondMultiplier + "?(-1 Quit)");
                    solution = input.nextInt();
                    if (solution == (firstMultiplier * secondMultiplier)) {
                        System.out.println("Very Good!");
                    }
                }
            }
        }while(solution != -1);
    }
}
