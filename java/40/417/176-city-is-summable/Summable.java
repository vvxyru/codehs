public class City implements Summable
{
    private int population;
    private String name;

    public City(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    
    public String getName()
    {
        return this.name;
    }
    // Just add these two and "implements Summable" at the top 
    public int getValue()
    {
        return this.population;
    }
    
    public int add(Summable other)
    {
        return getValue() + other.getValue();
    }
}
