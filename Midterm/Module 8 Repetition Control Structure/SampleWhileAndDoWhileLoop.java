import java.util.Scanner;
public class SampleWhileAndDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        // while(input != 1){
        //     System.out.print("Bring it on:");  
        //     input = scanner.nextInt();
        // }

        // System.out.println("You win.");

        do {
            System.out.print("Bring it on:");
            input = scanner.nextInt();
        }while (input != 1);

        System.out.println("You win.");
    }
}
