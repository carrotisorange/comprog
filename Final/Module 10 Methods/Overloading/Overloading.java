public class Overloading {
    public static void main(String[] args) {
        method1(1);
        method1(1);
        method1(1,1);
        method1(1,1,1);
    }

    public static void method1(int i) {
        System.out.println("This method has 1 parameter.");
    }

    public static void method1(int i, double j, double k) {
        System.out.println("This method has 3 parameters.");
    }

    public static void method1(double i, int j) {
        System.out.println("This method has 2 parameters.");
    }

    public static String method1(double i) {
        return "This method has a return type of String";
    }
}
