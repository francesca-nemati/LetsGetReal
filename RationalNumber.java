public class RationalNumber extends Number
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    numerator = nume;
    denominator = deno;
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    if (deno < 0) {
      numerator = numerator * -1;
      denominator = denominator * -1;
    }
    reduce();
  }

  public double getValue(){
    double nume = numerator;
    double deno = denominator;
    return (nume / deno);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber reciprocal = new RationalNumber(getDenominator(),getNumerator());
    return reciprocal;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (getNumerator() == other.getNumerator()) {
      if (getDenominator() == other.getDenominator()) {
        return true;
      }
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (getDenominator() == 1) return "" + getNumerator();
    if (getNumerator() == 0) return "" + 0;
    String rational = "" + numerator + "/" + denominator;
    return rational;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    //Euclid's method
    int A = Math.abs(a);
    int B = Math.abs(b);
    if (A < B && A != 0) {
      int A1 = A;
      A = B;
      B = A1; //switching values
    }
    int r = (A % B);
    while (r != 0) {
      A = B;
      B = r;
      r = (A % B);
    }
    return B;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int oldNume = getNumerator();
    int oldDeno = getDenominator();
    numerator = oldNume / gcd(oldNume, oldDeno);
    denominator = oldDeno / gcd(oldNume, oldDeno);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int nume = getNumerator() * other.getNumerator();
    int deno = getDenominator() * other.getDenominator();
    RationalNumber product = new RationalNumber(nume,deno);
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int reciprocalN = other.reciprocal().getNumerator();
    int reciprocalD = other.reciprocal().getDenominator();
    int nume = getNumerator() * reciprocalN;
    int deno = getDenominator() * reciprocalD;
    RationalNumber quotient = new RationalNumber(nume,deno);
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int nume1 = getNumerator() * other.getDenominator();
    int nume2 = other.getNumerator() * getDenominator();
    int deno = getDenominator() * other.getDenominator();
    int nume = nume1 + nume2;
    RationalNumber sum = new RationalNumber(nume,deno);
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int nume1 = getNumerator() * other.getDenominator();
    int nume2 = other.getNumerator() * getDenominator();
    int deno = getDenominator() * other.getDenominator();
    int nume = nume1 - nume2;
    RationalNumber difference = new RationalNumber(nume,deno);
    return difference;
  }
}
