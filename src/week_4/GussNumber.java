package week_4;

import java.util.Random;
import java.util.Scanner;

public class GussNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean conti = true;
        while (conti) {
            int count = 0;
            int answer = -2;
            Random myRandomNumber = new Random();
            int myTwoDigitNumber = Math.abs( myRandomNumber.nextInt() % 100 );
            System.out.println("***********************************");
            System.out.println("__________New Game Start___________");
            while (answer != myTwoDigitNumber && answer != -1) {
                System.out.println("Guess your number(-1 quit this game):");
                answer = input.nextInt();
                if (answer != -1) {
                    if (answer > myTwoDigitNumber) {
                        System.out.println("The guess is high!");
                    }

                    if (answer < myTwoDigitNumber) {
                        System.out.println("The guess is low!");
                    }
                    count++;
                }
            }
            System.out.println("The correct answer: " + myTwoDigitNumber + "\nTotal answer: " + count);

            System.out.println("Enter -1 to stop game, other number to continue.");
            if (input.nextInt() == -1) {
                conti = false;
            }
        }
    }
}
