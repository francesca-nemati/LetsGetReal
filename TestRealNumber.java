public class TestRealNumber {
  public static void main(String[] args) {

    RealNumber num1 = new RealNumber(100);
    RealNumber num2 = new RealNumber(99);

    RealNumber num3 = new RealNumber(100.000000001);
    RealNumber num4 = new RealNumber(100.000000002);

    RealNumber num5 = new RealNumber(Math.PI);
    RealNumber num6 = new RealNumber(3.1415926);

    System.out.println(num1.equals(num2));
    System.out.println(num3.equals(num4));
    System.out.println(num5.equals(num6));

    System.out.println(num1.add(num2) + ": should be 199;");
    System.out.println(num5.add(num1) + ": should be 103.1415926;");

    System.out.println(num1.multiply(num2) + ": should be 9900;");
    System.out.println(num5.multiply(num1) + ": should be 314.15926;");

    System.out.println(num3.divide(num4));
    System.out.println(num5.divide(num1) + ": should be 0.031415926");

    System.out.println(num3.subtract(num4) + ": should be -0.000000001");
    System.out.println(num5.subtract(num6) + ": should be 0.00000000535");
    System.out.println(num1.subtract(num2) + ": should be 1");

  }
}
