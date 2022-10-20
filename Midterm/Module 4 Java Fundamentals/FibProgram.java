import java.util.Scanner;
public class FibProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //step 2. declare the variables
        int a, b, c, n, i;
        //step 3. initialize the variables
        a = 0;
        b = 1;
        i = 2;
        //step 4. read input from the user
        n = scanner.nextInt();
        //step 6. repeat until i<=n
       while(i<=n)
       {

           try {
               for (int j = 0; j < 5; j++) {

                   // it will sleep the main thread for 1 sec
                   // ,each time the for loop runs
                   Thread.sleep(1000);

                   // This Thread.sleep() method will sleep the
                   // thread 0.
                   // printing the value of the variable
                   System.out.println(i);
               }
           } catch (Exception e) {

               // catching the exception
               System.out.println(e);
           }

            System.out.println(i + " value "+ a +", ");
            
            c = a + b;
            a = b;
            b = c;

            //step 9
            i++;

       }
    }
}
