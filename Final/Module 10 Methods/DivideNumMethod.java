import java.util.Scanner;
public class DivideNumMethod {
    public static void main(String[] args) {
        int dividend = acceptInput();
        int divisor = acceptInput();

        isDivisorValid(divisor);

        System.out.println(performDivision(dividend, divisor));
    }

    public static int acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter input");
        int input = scanner.nextInt();

        return input;
    }

    public static boolean isDivisorValid(int divisor)
    {
        boolean result = true;

        if(divisor == 0){
            System.out.println("Cannot divide a number by zero.");
            System.exit(0);
        }
        return result;
    }

    public static int performDivision(int dividend, int divisor)
    {
        int quotient = dividend/divisor;
        
        return quotient;
    }
    
}
