import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter a number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter a number: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter a number: ");
        int num5 = scanner.nextInt();

        int sum  = num1 + num2 + num3 + num4 + num5;
        int average = sum/5;

        System.out.printf("Sum is %d \n Average is %d", sum, average);

    }
}
