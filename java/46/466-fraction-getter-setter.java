// Fraction.java
public class Fraction
{
    private int num;
    private int den;
    
    public Fraction(int numerator, int denominator)
    {
        num = numerator;
        den = denominator;
    }
    
    public int getNumerator()
    {
        return num;
    }
    
    public int getDenominator()
    {
        return den;
    }
    
    public void setNumerator(int x)
    {
        num = x;
    }
    
    public void setDenominator(int x)
    {
        den = x;
    }
    
    public String toString()
    {
        return num + "/" + den;
    }
}

// FractionTester.java
public class FractionTester extends ConsoleProgram
{
    public void run()
    {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(4, 5);
        
        System.out.println(f1);
        System.out.println(f2);
    }
}
