import java.util.Scanner;
public class SampleDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of your account:");
        int age = scanner.nextInt();

        switch(age)
        {
            case 1: //driver

            System.out.println("I can see delivery orders");

            case 2: //entrep

            System.out.println("I can see orders from my resto");

            break;

            default: 

            System.out.println("I don't know you mean.");
        }

        // if(userType=="driver")
        // {
        //     System.out.println("I can see orders");
        // }if(userType=="entrepreneur"){
        //     System.out.println("I can see orders from my resto.");
        // }else{
        //     System.out.println("I can see resto.");
        // }
        // boolean vaccinationCard = false;

        // if(age>18)
        // {
        //     if(vaccinationCard)
        //     {
        //         System.out.println("You're an adult!");
        //         System.out.println("You can enter.");
        //     }
            
        // }else{
        //     System.out.println("You're not an adult.");
        // }


    }
}
