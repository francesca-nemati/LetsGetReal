public class TestRealNumber {
  public static void main(String[] args) {

    RealNumber num1 = new RealNumber(100);
    RealNumber num2 = new RealNumber(99);

    RealNumber num3 = new RealNumber(100.000000001);
    RealNumber num4 = new RealNumber(100.000000002);

    RealNumber num5 = new RealNumber(Math.PI);
    RealNumber num6 = new RealNumber(3.1415892);

    System.out.println(num1.equals(num2));
    System.out.println(num3.equals(num4));
    System.out.println(num5.equals(num6));

    System.out.println(num1.add(num2) + ": should be 199;");
  }
}
