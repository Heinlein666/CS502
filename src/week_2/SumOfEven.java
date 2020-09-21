package week_2;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        System.out.println("Please Enter a integer(>=2):");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int sum = 0;
        if (value >= 2) {
            for (int i = 2; i <= value; i++) {
                if (isEven(i)) {
                    sum += i;
                }
            }
            System.out.println("Even sum between 2 and " + value + " is:" + sum);
        }else {
            System.out.println("Your input must bigger than or equal to 2!");
        }

    }

    private static boolean isEven(int value) {
        if ((value % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }

    /*
    sum = ((0 + n-1) * n)/2 *2 + 2n
    把2当作数轴的起点，则每一项到起点的距离构成一个等差数列（0，1，2，... n-1）,及到起点2有几个2，然后每一项都需要加2，因为把2当作起点。
     */

}
