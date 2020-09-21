package week_3;

import java.util.Scanner;

public class GetPaid {
    public static void main(String[] args) {
        boolean conti = true;
        Scanner input = new Scanner(System.in);
        int option = 0;
        double sallary = 0;
        int hours = 0;
        while (conti) {
            System.out.println("*******************************************************");
            System.out.println("\t\t\t\t\tMenu");
            System.out.println("*******************************************************");
            System.out.println("1)      Calculate earnings at $10.00/hr");
            System.out.println("2)      Calculate earnings at $.10 doubled each hour");
            System.out.println("3) Exit");
            System.out.println("*******************************************************");
            System.out.println("Please Enter Your Choice:");
            option = input.nextInt();
            if (option == 1) {
                System.out.println("How many hours? ");
                hours = input.nextInt();
                sallary = hours * 10;
                System.out.println("You will earn " + sallary);
                sallary = 0;
            } else if (option == 2) {
                sallary = 0;
                System.out.println("How many hours? ");
                hours = input.nextInt();
                double housSallary = 0.1;
                for (int i = 1; i <= hours; i++) {
                    sallary += housSallary;
                    housSallary *= 2;
                }
                System.out.printf("You will earn %.2f\n", sallary);
                sallary = 0;
                //sallary =  (0.1 * (1 - Math.pow(2,hours))) / (1 - 2);
            } else if (option == 3) {
            conti = false;
        } else {
            System.out.println("Errow, please enter 1, 2 or 3!");
        }
    }
}
}
