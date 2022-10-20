import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the your age?");
      String type_of_user = scanner.nextLine();

      // if(type == "savings"){
      //   System.out.println("You've selected "+ type);
      // }else{
      //   System.out.println("You've selected " + type);
      // }

      switch(type_of_user) 
      {
        case "Driver": ;
          System.out.println("I can see the map.");
          break;
        case "Restaurants": ;
          System.out.println("I can see orders.");
          break;
        case "Food lover": ;
          System.out.println("I can see food.");
          break;
        default: 
          System.out.println("I don't know what you mean.");
        ;
      }
        
    }
}
