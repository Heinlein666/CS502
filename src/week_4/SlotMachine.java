package week_4;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {
        boolean conti =true;
        int[] threeNumber = new int[3];
        SlotMachine sl = new SlotMachine();
        Scanner input = new Scanner(System.in);
        while (conti) {
            threeNumber = sl.generateThreeSingleDigitNumber();
            System.out.println(threeNumber[0] + "\t" + threeNumber[1] + "\t" + threeNumber[2]);
            if (threeNumber[0] == threeNumber[1] && threeNumber[1] == threeNumber[2]) {
                System.out.println("Congratulation, you get three same number!!!");
            }else if (threeNumber[0] == threeNumber[1] || threeNumber[0] == threeNumber[2] || threeNumber[1] == threeNumber[2]) {
                System.out.println("Good, you get two same number.");
            }else {
                System.out.println("Come on, try again.");
            }

            System.out.println("Enter 1 to continue and -1 to end.");
            if (input.nextInt() == -1) {
                conti = false;
            }
        }
    }

    private int[] generateThreeSingleDigitNumber () {
        Random myRandom = new Random();
        int[] threeNumber = new int[3];
        for (int i = 0; i < 3; i++) {
            threeNumber[i] = Math.abs(myRandom.nextInt()) % 10;
        }
        return threeNumber;
    }
}
