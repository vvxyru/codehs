import java.lang.Math;

public class Cylinder extends Solid
{
    private int radius, length;
    // Code goes here!
    public Cylinder(String name, int radius, int length)
    {
        super(name);
        this.radius = radius;
        this.length = length;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public int getLength() {
        return length;
    }
    
    public double volume()
    {
        return (double)(Math.PI * radius * radius) * length;
    }
    
    public double surfaceArea()
    {
        return (double)((Math.PI * radius * radius)*2) + ((Math.PI * radius * 2) * length); 
    }
}