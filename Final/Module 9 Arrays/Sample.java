import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        System.out.println("Enter 5 Integers: ");

        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            sum += number;
        }
    
        System.out.println("The sum is " + sum);
        System.out.println("The reverse order is:");
    }
}
