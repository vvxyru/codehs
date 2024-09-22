public class Battery
{
    private double voltage;
    public static int numOfBatteries = 0;
    public static double totalVoltage;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        numOfBatteries ++;
        totalVoltage += voltage;
        
    }
    
    public double getVoltage()
    {
        return this.voltage;
    }
}