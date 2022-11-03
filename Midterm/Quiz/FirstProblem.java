import java.util.Scanner;
public class FirstProblem{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberOfSharesSold;
        double purchasePricePerShare;
        double sellingPricePerShare;

        double amountInvested;
        double totalServiceCharges;
        double totalNetProfit;
        double totalGrossProfit;

        System.out.print("Enter the number of shares sold: ");
        numberOfSharesSold = scanner.nextDouble();
        
        System.out.print("Enter the purchase price per share: ");
        purchasePricePerShare = scanner.nextDouble();

        System.out.print("Enter the selling price per share: ");
        sellingPricePerShare = scanner.nextDouble();

        amountInvested = numberOfSharesSold * purchasePricePerShare;
        totalGrossProfit = numberOfSharesSold * sellingPricePerShare;
        totalServiceCharges = totalGrossProfit * .015;
        totalNetProfit = totalGrossProfit - amountInvested; 
        

        System.out.println("Total amount invested is: " + amountInvested);
        System.out.println("Total service charges: " + totalServiceCharges);
        System.out.println("Total net profit: " + totalNetProfit);
        System.out.println("Total gross profit: " + totalGrossProfit);
    }
}