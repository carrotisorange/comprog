package Exam;

public class Problem2 {

    public static void main(String[] args) {
        //outer for loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                //print spaces
                System.out.print(" ");
                for (int k = 0; k < (2 * i + 1); k++)
                //print the character
                    System.out.print("*");
            System.out.println();
        }
    }
}