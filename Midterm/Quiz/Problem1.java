// Cindy uses the services of a brokerage firm to buy and sell stocks. 
// The firm charges 1.5% service charges on the total amount for each transaction, buy or sell. 
// When Cindy sells stocks, she would like to know if she gained or lost on  a particular investment. 

// Write a program that allows Cindy to input the number of shares sold, the purchase price of each share, and the selling price of each share.
//  The program outputs the 
//  amount of invested, 
//  the total service charges,
//   amount gained or lost, 
//   and the amount received after selling the stock.

import java.util.Scanner;
public class Problem1{
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
        totalServiceCharges = (amountInvested * .015) + (totalGrossProfit * .015);
        totalNetProfit = totalGrossProfit - (amountInvested + totalServiceCharges); 
        
        System.out.println("Total amount invested is: " + amountInvested);
        System.out.println("Total service charges: " + totalServiceCharges);
        System.out.println("Total net profit: " + totalNetProfit);
        System.out.println("Total gross profit: " + totalGrossProfit);
    }
}