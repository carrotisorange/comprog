public class DisplayMultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { //outer loop
            for (int j = i; j < 5; j++) { //inner loop
                System.out.println("*");
            }
        }
    }
}
