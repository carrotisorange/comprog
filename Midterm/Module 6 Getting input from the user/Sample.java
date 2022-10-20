
 import java.util.Scanner;
 public class Sample {
     public static void main (String[] args) {
         Scanner scanner = new Scanner (System.in);
         
         System.out.println("Enter outside diameter: ");
         double outDia = scanner.nextDouble();
         
         System.out.println("Enter inside diameter: ");
         double inDia = scanner.nextDouble();
         
         System.out.println("The thickness of the wall of the pipe is " + (outDia-inDia)/2 );
     }
 }