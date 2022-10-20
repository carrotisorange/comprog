import java.util.Scanner;
public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();



        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        System.out.print("Enter your salary:");
        double salary = scanner.nextDouble();

    

        System.out.println("My name is " + name);  
        System.out.println("My age is " + age);  
        System.out.println("My salary is " + salary);
    }
}
