import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int guess = 0;
        int counter = 0;

        boolean done;

        num = (int) (Math.random() * 100);
        done = false;

        while (!done && counter < 5) {
            System.out.println("Enter an integer greater or equal to 0 and less than 100.");
            guess = scanner.nextInt();
            counter++;
            if (guess == num) {
                System.out.println("You guessed the correct number!");
                done = true;
            } else if (guess < num) {
                System.out.println("Your guess is lower than the number. \n Guess again!");
            } else {
                System.out.println("Your guess is higher than the number. \n Guess again!");
            }

        }
        System.out.println("You lost!");
    }
}
