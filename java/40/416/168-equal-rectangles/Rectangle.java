public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

   // Add toString and equals methods
   
    public int getWidth() {
       return width;
    }
    
    public int getHeight() {
       return height;
    }
   
    public String toString() {
        return "A rectangle with a width of " + width + " and a height of " + height;   
    }
    
    public boolean equals(Rectangle other) {
        return (width == other.getWidth()) && (height == other.getHeight());
    }
}