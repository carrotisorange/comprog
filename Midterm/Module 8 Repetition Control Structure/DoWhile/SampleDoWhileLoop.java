
// this program lets you enter 5 integer values and pring the sum and average.abstract

import java.util.Scanner;

public class SampleDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int counter = 0;

        System.out.println("Counter is " + counter);

        do {
            System.out.print("Enter a number");

            num = scanner.nextInt();
            sum = sum + num;
            counter++;
            
        }while (counter < 5);

        System.out.printf("Sum is %d \n Average is %d", sum, sum / 5);
    }
}
