
// this program will let you enter any integer numbers but once
// -999 is detected, it will display the sum and average and terminate.

import java.util.Scanner;

public class SampleSentinelControlledWhileLoop {
    static final int SENTINEL = -999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int counter = 0;

        System.out.println("Line 1: Enter positive integers ending with " + SENTINEL);

        number = scanner.nextInt();

        while (number != SENTINEL) {
            sum = sum + number;
            number = scanner.nextInt();
        }

        System.out.printf("Line 7: The sum of %d numbers = %d%n", count, sum);

        if (counter != 0) {
            System.out.printf("Line 9: The average = %d%n", (sum / count));
        } else {
            System.out.println("Line 11: No Input!");
        }
    }
}
