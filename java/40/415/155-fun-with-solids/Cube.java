public class Cube extends RectangularPrism
{
    // Code goes here!
    
    public Cube(String name, int length)
    {
        super(name, length, length, length);
    }
    
    public double volume()
    {
        return getLength() * getLength() * getLength();
    }
    
    public double surfaceArea()
    {
        return (getLength() * getLength()) * 6;
    }
}