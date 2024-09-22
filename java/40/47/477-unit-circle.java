public class UnitCircle extends ConsoleProgram
{
    private double currentRadian;
    private double currentSin;
    private double currentCos;
    
    public void run()
    {
        // O(1) constant time
        System.out.println("Radians: (cos, sin)");
        for (double i = 0; i < (2 * Math.PI); i += (double) (Math.PI / 4))
        {
            currentRadian = round(i);
            currentCos = round(cos(i));
            currentSin = round(sin(i));
            System.out.println(currentRadian + ": " + currentCos + ", " + currentSin);
            
        }
    }
    
    public double round(double value)
    {
        return (double) Math.round(value * 100) / 100.0;
    }
    
    public double cos(double value)
    {
        return (double) Math.cos(value);
    }
    
    public double sin(double value)
    {
        return (double) Math.sin(value);
    }
}

            // One liner
            // System.out.println((Math.round(i * 100) / 100.0) + ": " 
            // + (Math.round(Math.cos(i) * 100) / 100.0) + ", " 
            // + (Math.round(Math.sin(i) * 100) / 100.0));
