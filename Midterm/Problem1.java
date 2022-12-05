import java.util.Scanner;

public class Problem1 {
    public static void main(String[] Args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of shares sold: ");
        int A = x.nextInt();
        System.out.print("Enter the purchase price of each share: ");
        double B = x.nextDouble();
        System.out.print("Enter the selling price of each share: ");
        double C = x.nextDouble();
        double FC = 0.015;
        double amountOfInvested = A * B;
        double totalServiceCharges = B * FC;
        double receivedMoney = C * FC;
        double gainedOrLost = receivedMoney - amountOfInvested;
        System.out.println("The amount invested is " + amountOfInvested);
        System.out.println("The total service charge is " + totalServiceCharges);
        System.out.println("The amount gained or lost by Cindy is " + gainedOrLost);
        System.out.println("The amount received after selling the stock is " + receivedMoney);
    }
}