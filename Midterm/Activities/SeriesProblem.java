import java.util.Scanner;

public class SeriesProblem {
    public static void main(String[] Args) {
        System.out.println("Resistor Computation");
        Scanner x = new Scanner(System.in);
        System.out.print("Enter resistor1: ");
        double R1 = x.nextDouble();
        System.out.print("Enter resistor2: ");
        double R2 = x.nextDouble();
        System.out.print("Enter resistor3: ");
        double R3 = x.nextDouble();
        System.out.print("Enter resistor4: ");
        double R4 = x.nextDouble();
        double SC = R1 + R2 + R3 + R4;
        double PC = 1 / ((1 / R1) + (1 / R2) + (1 / R3) + (1 / R4));
        System.out.println("Total Resistance");
        System.out.println("Series Connection: " + SC);
        System.out.println("Parallel Connection: " + PC);
    }
}