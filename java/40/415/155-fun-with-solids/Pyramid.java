import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here!
    private int length, width, height;
    
    public Pyramid(String name, int length, int width, int height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public double volume()
    {
        return (double)(length * width * height) / 3.0;
    }
    
    public double surfaceArea()
    {
        return (double)(length * width) + (length * Math.sqrt((width / 2.0) * (width/2.0) + (height * height))) + (width * Math.sqrt((length / 2.0) * (length/2.0) + (height * height)));
    }
}
// When testing, values will be passed in this order: length, width, height