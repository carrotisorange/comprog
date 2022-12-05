import java.util.Scanner;

public class Locker {
    public static void main(String[] Args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of lockers: ");
        int N = x.nextInt();
        boolean[] L = new boolean[N];
        for (int C = 1; C <= N; C++) {
            for (int S = C; S < N; S += C) {
                L[S] = !L[S];
            }
        }
        for (int C = 0; C < L.length; C++) {
            if (L[C] == true) {
                System.out.println("The locker " + C + " is open");
            }
        }
    }
}