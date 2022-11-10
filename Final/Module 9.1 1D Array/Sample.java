import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num0, num1, num2, num3,num4;
        int sum = 0;

        System.out.println("Enter five integers:");
        num0 = scanner.nextInt();
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();

        sum = num0 + num1 + num2 + num3 + num4;

        System.out.printf("The sum is %d \n", sum);
        System.out.println("The reverse order is: " + num4 + ", " + num3 +", " + num2 +", " + num1 +", "+ num0);

    }
}
