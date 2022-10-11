import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next(); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble(); 

        System.out.println("Hello " + name);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);
        
    }
}
