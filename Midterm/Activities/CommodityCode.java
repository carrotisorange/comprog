import java.util.Scanner;

public class CommodityCode{
    public static void main(String[] Args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter commodity code: ");
        char CC = input.next () .charAt(0);
        if (CC== 'J')
        {
            
    System.out.print("Enter quantity of commodity: ");
    double QC = input.nextDouble() ;
    System.out.print("Enter unit price: ");
    double UP = input.nextDouble() ;
    double OP = UP * QC;
    double DV = OP * 0.08;
    double DP = OP - DV;
    System.out.println("Amount to be paid is P" + DP);
} else if  (CC == 'K')
{
    System.out.print("Enter quantity of commodity: ");
    double QC = input.nextDouble() ;
    System.out.print("Enter unit price: ");
    double UP = input.nextDouble() ;
    double OP = UP * QC;
    double TV = OP * 0.11;
    double TP = OP + TV;
    System.out.println("Amount to be paid is P: " + TP);
} else if  (CC == 'L')
{
    System.out.print("Enter quantity of commodity: ");
    double QC = input.nextDouble() ;
    System.out.print("Enter unit price: ");
    double UP = input.nextDouble() ;
    double P = UP * QC;
    System.out.println("Amount to be paid is P: " + P);
} else 
{
    System.out.print("Invalid Code");
    
    }
}
}