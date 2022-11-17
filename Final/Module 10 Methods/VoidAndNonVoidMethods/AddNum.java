package VoidAndNonVoidMethods;
public class AddNum {
    public static void main(String[] args) {
        System.out.println("Value returning method:");
        int sum = addTwoNumNotVoid(5, 5);
        int newSum = sum + 1;
        System.out.println(newSum);
        System.out.println(sum);
        System.out.println("Void method:");
        addTwoNumVoid(5, 5);
    }    

    public static int addTwoNumNotVoid(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void addTwoNumVoid(int num1, int num2){
        System.out.println(num1+num2);
    }
}
