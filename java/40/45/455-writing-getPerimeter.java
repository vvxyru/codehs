// Rectangle.java
public class Rectangle
{
    private int width;
    private int height;
    
    public int getPerimeter()
    {
        return (width * 2) + (height * 2);
    }
    
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    public int getArea()
    {
        return width * height;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}

// RectangleRester.java
public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println(rect1.getPerimeter());
    }
}
