import java.util.Scanner;

public class SampleForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

       for (int i = 0; i < 5; i++) {
           System.out.print("Enter a number");

           num = scanner.nextInt();
           sum = sum + num;
       }
 
        System.out.printf("Sum is %d \n Average is %d", sum, sum / 5);
    }
}
