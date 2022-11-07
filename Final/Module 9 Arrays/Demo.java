import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. declaring an array
        // int x[] = new int[5];
        //1. Another example of declaring an array
        //String[] s = new String[5];
        //2. assigning a value to an array (initialization)
        // s[0] = "Bruce";
        // s[1] = "Clark";
        // s[2] = "Clark";
        // s[3] = "Hal";
        // s[4] = "Arthur";
        // s[5] = "asd";
        //2. alternate way to assign values to an array 
        // String[] s = {"Bruce", "Clark", "Barry", "Hal", "Arthur"};
        //3. Printing out the value of an array
        // System.out.println(s[0]);
        // System.out.println(s[1]);
        // System.out.println(s[2]);
        // System.out.println(s[3]);
        // System.out.println(s[4]);
        //3. alternate way to print the value of an array
        // for (int i = 0; i < s.length; i++) {
        //     System.out.println(s[i]);
        // }

        //other more advanced stuff we can do on arrays. consider this values

        // double[] sales  = new double[10];
        // double largestSale, sum, average;

        // 1. Initializing an array to a specific value
        // Suppose that you want to initialize every element of the array sales to
        // 10.00.
        // You can use the following loop:

        // for (int i = 0; i < sales.length; i++) {
        //     sales[i] = 10.00;
        // }

        //2. Reading data into an array: The following loop inputs data into the array sales.
        //For simplicity, we assume that the data is entered at the keyboard one number per line.
        // for (int i = 0; i < sales.length; i++) {
        //     sales[i] = scanner.nextDouble();
        // } 

        //3. Print an array: The following loop outputs the elements of array sales. 
        //For simplicity, we assume that the output goes to the screen.
        // for (int i = 0; i < sales.length; i++) {
        //     System.out.println(sales[i] + " ");
        // }

        //4. Finding the sum and average of an array: Because the array sales, as its name implies,
        //represents certain sales data, it may be desirable to find the total sale and average sales amounts.
        //The following Java code finds the sum of the elements of the array sales (total sales)
        //and the average of the sale amount. 
        // sum = 0;
        // for (int i = 0; i < sales.length; i++) {
        //     sum = sum + sales[i];

        //     if(sales.length !=0 ){
        //         average = sum/sales.length;
        //     }else{
        //         average = 0.0;
        //     }
        // }

        //5. Determining the largest element in the array. 
        // int maxIndex = 0;
        // for (int i = 0; i < sales.length; i++) {
        //     if(sales[maxIndex] < sales[i]){
        //         maxIndex = i;
        //     }
        // }
        //     largestSale = sales[maxIndex];

        //     System.out.println(largestSale);

        //Array Index Out of Bounds
        // double[] y = new double[5];
        // System.out.println(y[4]);

        //copying values in array
        // int[] listA = {5,10,15, 20, 25, 30, 35};
        // int[] listB = new int[listA.length];

        //shallow copying
        // listB = listA;

        // System.out.println("listA " + listA);
        // System.out.println("listB " + listB);

        // if(listB == listA){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not equal");
        // }

        //deep copying
        // for (int i = 0; i < listB.length; i++) {
        //     listB[i] = listA[i];
        // }

    }

}
