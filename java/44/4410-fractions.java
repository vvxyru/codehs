// Fraction.java
public class Fraction
{
    private int num;
    private int den;
    
    public Fraction(int theNumerator, int theDenomenator)
    {
        num = theNumerator;
        den = theDenomenator;
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
        // Test out your Fraction class here!
        Fraction half1 = new Fraction(1, 2);
        Fraction half2 = new Fraction(4, 6);
        Fraction half3 = new Fraction(2, 7);
        
        System.out.println(half1);
        System.out.println(half2);
        System.out.println(half3);
    }
}
