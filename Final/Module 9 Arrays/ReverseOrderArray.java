import java.util.Scanner;

import java.util.Scanner;
public class ReverseOrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] items = new int[5];

        int sum;

        System.out.println("Enter five integers:");

        sum = 0;

        for (int i = 0; i < items.length; i++) {
            items[i] = scanner.nextInt();
            sum = sum + items[i];
        }

        System.out.printf("The sum of the numbers = %d \n", sum);
        System.out.print("The numbers in the revers order are: ");
        for (int i = items.length-1; i>=0; i--) {
            System.out.print(items[i] + " ");
        }
        
    }
}
