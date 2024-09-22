// Fraction.java
public class Fraction
{
    // Create your instance variables and constructor here
    private int num;
    private int den;
    
    public Fraction(int numerator, int denominator)
    {
        num = numerator;
        den = denominator;
    }
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return den;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        den = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = (num * other.getDenominator()) + (other.getNumerator() * den);
        den = (den * other.getDenominator());
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = (num * other.getDenominator()) - (other.getNumerator() * den);
        den = (den * other.getDenominator());
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getNumerator();
        den = den * other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num + "/" + den;
    }
}


