public class Flower
{
    // put into Flower.java

    private String name;
    private String color;
    private String genus;
    private String species;
    
    public String toString()
    {
        return color + " " + name + " (" + genus + " " +species + ")";
    }

    public Flower(String theName, String theColor, String theGenus, String theSpecies)
    {
        name = theName;
        color = theColor;
        genus = theGenus;
        species = theSpecies;
    }
}
