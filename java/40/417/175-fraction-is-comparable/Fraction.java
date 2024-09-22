public class Fraction implements Comparable<Fraction> {
  private int numerator;
  private int denominator;

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int getNumerator() { return numerator; }

  public int getDenominator() { return denominator; }

/* ??? */
  public int compareTo(Fraction other) {
    double diff = ((double)this.getNumerator() / this.getDenominator()) -
                  ((double)other.getNumerator() / other.getDenominator());
    return (int)Math.signum(diff);
  }

  public boolean equals(Object other) {
    return other instanceof Fraction && compareTo((Fraction)other) == 0;
  }
}
