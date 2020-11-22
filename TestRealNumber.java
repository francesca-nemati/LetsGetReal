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
    System.out.println();

    RationalNumber rat1 = new RationalNumber(1,2);
    RationalNumber rat2 = new RationalNumber(2,1);
    RationalNumber rat3 = new RationalNumber(1,0);
    RationalNumber rat4 = new RationalNumber(3,-4);
    RationalNumber rat5 = new RationalNumber(-3,-4);

    System.out.println(rat1.getValue() + ": should be 0.5");
    System.out.println(rat2.getValue() + ": should be 2");
    System.out.println(rat3.getValue() + ": should be 0");
    System.out.println(rat4.getValue() + ": should be -0.75");
    System.out.println(rat5.getValue() + ": should be 0.75");
    System.out.println();

    System.out.println(rat1.getNumerator() + ": should be 1");
    System.out.println(rat2.getNumerator() + ": should be 2");
    System.out.println(rat3.getNumerator() + ": should be 0");
    System.out.println(rat4.getNumerator() + ": should be -3");
    System.out.println(rat5.getNumerator() + ": should be 3");
    System.out.println();

    System.out.println(rat1.getDenominator() + ": should be 2");
    System.out.println(rat2.getDenominator() + ": should be 1");
    System.out.println(rat3.getDenominator() + ": should be 1");
    System.out.println(rat4.getDenominator() + ": should be 4");
    System.out.println(rat5.getDenominator() + ": should be 4");
    System.out.println();

    System.out.println(rat1.reciprocal().getValue() + ": should be 2");
    System.out.println(rat2.reciprocal().getValue() + ": should be 0.5");
    System.out.println(rat3.reciprocal().getValue() + ": should be 0");
    System.out.println(rat4.reciprocal().getValue() + ": should be -1.333333");
    System.out.println(rat5.reciprocal().getValue() + ": should be 1.3333333");

    System.out.println(rat1.equals(rat2) + ": should be false");
    System.out.println(rat1.equals(rat2.reciprocal()) + ": should be true");

  }
}
