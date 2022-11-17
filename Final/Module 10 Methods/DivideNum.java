import java.util.Scanner;
public class DivideNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dividend");
        int dividend = scanner.nextInt();

        System.out.println("Enter divisor");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide a number by zero.");
            System.exit(0);
        }

        int quotient = dividend/divisor;

        System.out.println(quotient);
    }
}