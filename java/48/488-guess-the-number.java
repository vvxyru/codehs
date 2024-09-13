// ExtrememMain.java
public class ExtremeMain extends ConsoleProgram
{
    public void run()
    {
        
        // Create an Extremes object
        
        Extremes extreme1 = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        
        int maxInput = readInt("Guess the maximum Integer value: ");
        
        // Compute and display the difference
        // between the max and the guess
        
        // why does math.abs work on the variable but
        // not in the extremes.java i dont get it
        int maxD = extreme1.maxDiff(maxInput);
        System.out.println("You were off by " + Math.abs(maxD));
        
        // Ask the user to guess the minimum value of an Integer
        
        int minInput = readInt("Guess the minimum Integer value: ");
        
        // Compute and display the difference 
        // between the min and the guess
        
        int minD = extreme1.minDiff(minInput);
        System.out.println("You were off by " + Math.abs(minD));
        
    }
}

// Extrems.java
public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        return max - number;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        return min - number;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
