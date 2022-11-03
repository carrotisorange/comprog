public class DisplayMultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //outer loop
            for (int j = i; j <= 10; j++) { //inner loop
                System.out.println(i +" * " +j + " = "+ (i*j) );
            }
        }
    }
}
