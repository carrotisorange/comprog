/* ALPNZP, RALPH JOSHUA I.
 *BSCE I-1
 *2230270
 */
 
import java.util.Scanner;

public class challenge3
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        int sum = num1+ num2;
        System.out.print("Sum of numbers: " + sum);
        
        System.out.println("");
        System.out.print("Do you want to continue:  ");
        char con = sc.next().charAt(0);
        
        do{
        System.out.print("Enter first number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num4 = sc.nextInt();
        
        int sum2 = num3+ num4;
        System.out.print("Sum of numbers: " + sum2);
        
        System.out.println("");
        System.out.print("Do you want to continue:  ");
        char c = sc.next().charAt(0);
        
        if(c == 'n'){
            break;
        }
        }while(con == 'y');
	