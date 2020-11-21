public class TestRealNumber {
  public static void main(String[] args) {

    RealNumber num1 = new RealNumber(100);
    RealNumber num2 = new RealNumber(99);

    RealNumber num3 = new RealNumber(100.000000001);
    RealNumber num4 = new RealNumber(100.000000002);

    System.out.println(num1.toString());
    System.out.println(num2.toString());

    System.out.println(num1.equals(num2));
    System.out.println(num2.equals(num1));

    System.out.println(num3.equals(num4));
    System.out.println(num4.equals(num3));

  }
}
