// this program lets you guess a  number, from 0-100. The program will give you hint
// every time you input a number to help you guess the number.

import java.util.Scanner;
public class SampleFlagControlledWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int guess = 0;

        boolean done;

        num = (int)  (Math.random() * 100);
        System.out.println(num);
        done = false;

        while(!done){
            System.out.println("Enter an integer greater or equal to 0 and less than 100.");
            guess = scanner.nextInt();

            if(guess == num){
                System.out.println("You guessed the correct number!");
                done = true; 
            }else if(guess < num){
                System.out.println("Your guess is lower than the number. \n Guess again!");
            }else{
                System.out.println("Your guess is higher than the number. \n Guess again!");
            }

        }
    }
}
