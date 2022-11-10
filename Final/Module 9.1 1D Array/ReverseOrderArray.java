import java.util.Scanner;

import java.util.Scanner;
public class ReverseOrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];

        int sum = 0;

        System.out.println("Enter five integers:");


        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        System.out.printf("The sum of the numbers = %d \n", sum);
        System.out.print("The numbers in the reverse order are: ");
        for (int i = num.length-1; i>=0; i--) {
            System.out.print(num[i] + " ");
        }
        
    }
}
