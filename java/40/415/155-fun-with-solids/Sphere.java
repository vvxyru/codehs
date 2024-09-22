import java.lang.Math;

public class Sphere extends Solid
{
    // Code goes here!
    private int radius;
    
    public Sphere(String name, int radius)
    {
        super(name);
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public double volume()
    {
        return (double)(4.0/3.0) * Math.PI * (radius * radius * radius);
    }
    
    public double surfaceArea()
    {
        return (double) 4 * Math.PI * (radius * radius);
    }
}