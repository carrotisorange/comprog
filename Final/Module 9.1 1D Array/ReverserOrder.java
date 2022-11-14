import java.util.Scanner;
public class ReverserOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, num0, num1, num2, num3, num4;

        System.out.println("Enter 5 integers");
        num[0] = scanner.nextInt();
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();   

        sum  = num0 + num1 + num2 + num3 + num4;
        
        System.out.printf("The sum of the numbers = %d \n", sum);
        System.out.printf("The numbers in the revers order are: %d, %d, %d, %d, %d", num4, num3, num2, num1, num0);

    }
}
