public class AnotherProgram {
    public static void main(String[] args) {
      int dividend = DivideNumMethod.acceptInput();
      int divisor = DivideNumMethod.acceptInput();

      DivideNumMethod.isDivisorValid(divisor);

      System.out.println(DivideNumMethod.performDivision(dividend, divisor));
      //non-static
      // MainMethod101 m1 = new MainMethod101();
      // m1.max(10,1);

      // //static
      // MainMethod101.max(10,1);

      
      // int max = MainMethod101.max(10,5);
      // System.out.println(max);
    }
}
